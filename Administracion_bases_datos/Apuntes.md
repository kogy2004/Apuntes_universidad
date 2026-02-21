# Administración de bases de datos

## Pendientes

* Como hacer querys
* que es una particion y como hacerla
* consultar
  * DataMarks
  * Mineria de datos
  * bisnes intelligence (BI)

## Unidad 1 - Oracle

RDBMS capaz de manejar grandes cantidades de datos, en un entorno multiusuario.

Multi-usuario (Concurrencia): varios usuarios pueden acceder a la base de datos al mismo tiempo, sin que se produzcan conflictos o pérdidas de datos.

Oracle es basicamente una herracmienta Cliente/Servidor para la gestion de bases de datos.

### Características

Herramienta de administración de bases de datos grafica que es muy intuitiva y y comoda de utilizar.

Ayuda a analizar datos y efectuar recomendaciones para mejorar el redimiento y la eficiencia en el manejo de aquellos datos que se encuentran almacenados.

### Ventajas

* Puede ejecutarse sobre cualquire sistema operativo, lo que la hace muy versatil.

* Es el motor de base de datos mas utilizado en el mundo, lo que garantiza una gran cantidad de recursos y soporte disponibles.

* Permite una **integridad referencial** declarativa bastante potente, lo que ayuda a mantener la consistencia de los datos.

        > ACID: Atomicidad, Consistencia, Aislamiento y Durabilidad. Estas propiedades garantizan que las transacciones se ejecuten de manera confiable y segura.

        > Modelo relacional: es un modelo de base de datos que organiza los datos en tablas (relaciones) con filas y columnas. Cada tabla representa una entidad o concepto, y las relaciones entre las tablas se establecen mediante claves primarias y foráneas.

### ventajas de Oracle

* permite el **uso de particiones** para la mejora de la eficiencia, de replicacion e incluso ciertas versiones admiten la administracion de bases de datos distribuidas.

        > uso de particiones: es una técnica que divide una tabla grande en partes más pequeñas y manejables, lo que mejora el rendimiento y la eficiencia en la gestión de datos.

        > afinar: es el proceso de optimizar el rendimiento de una base de datos mediante la identificación y corrección de problemas que puedan afectar su eficiencia. Esto puede incluir la optimización de consultas, la mejora de índices, la gestión de recursos y la configuración del sistema.

        > particionar: es el proceso de dividir una tabla grande en partes más pequeñas y manejables, lo que mejora el rendimiento y la eficiencia en la gestión de datos.

* El software del servidor puede ser instalado en una amplia variedad de plataformas, lo que lo hace muy versátil y adaptable a diferentes entornos.

* La tecnologia **RAC** es una de las soluciones mas estables y de altas funcionalidades para el area de alta disponibilidad y escalabilidad, lo que permite a las empresas garantizar la continuidad del negocio y el acceso a los datos en todo momento

        RAC (Real Application Clusters): es una tecnología de Oracle que permite que varias instancias de la base de datos se ejecuten en diferentes servidores, proporcionando alta disponibilidad y escalabilidad.

        cluster: es un grupo de servidores que trabajan juntos para proporcionar alta disponibilidad y escalabilidad en una base de datos.

        HA (High Availability): es la capacidad de un sistema para mantenerse operativo y accesible incluso en caso de fallos o interrupciones.

## Unidad 2 - Administración de bases de datos

### Arquitectura de oracle

La arquitectura de Oracle se compone de varios componentes clave que trabajan juntos para proporcionar una plataforma robusta y eficiente para la gestión de bases de datos. Estos componentes incluyen:

    * Instancia de Oracle: es el conjunto de procesos y memoria que se utilizan para gestionar la base de datos. Cada instancia de Oracle se ejecuta en un servidor y puede manejar una o más bases de datos.

    * Base de datos: es el conjunto de archivos que contienen los datos y la información de control de la base de datos. Cada base de datos se asocia con una instancia de Oracle.

arquitetura Fisica

    * Archivos de datos: son los archivos que contienen los datos de la base de datos. Estos archivos se organizan en grupos de archivos y se utilizan para almacenar las tablas, índices y otros objetos de la base de datos.

    * Archivos de control: son los archivos que contienen información sobre la estructura y el estado de la base de datos. Estos archivos se utilizan para controlar el acceso a la base de datos y garantizar su integridad.

    * Archivos de redo log: son los archivos que registran los cambios realizados en la base de datos. Estos archivos se utilizan para recuperar la base de datos en caso de fallos o interrupciones.

### Estructura de memoria

esta formada por dos areas de memorias llamadas SGA y PGA

**SGA** (System Global Area): es un área de memoria compartida que contiene datos y estructuras de control utilizadas por todas las instancias de la base de datos. Incluye el buffer cache, el shared pool, el redo log buffer y otras estructuras necesarias para el funcionamiento de la base de datos.

la informacion que se almacena en esta area consiste en:

* shared pool: es un área de memoria que contiene información compartida entre las instancias de la base de datos, como el código de ejecución de las consultas, los planes de ejecución y otros datos relacionados con la gestión de la base de datos.

* darabase buffer: es un área de memoria que se utiliza para almacenar los bloques de datos que se han leído desde el disco. Esto permite un acceso más rápido a los datos, ya que se pueden recuperar directamente desde la memoria en lugar de tener que leerlos desde el disco cada vez.

* redo log buffer: es un área de memoria que se utiliza para almacenar los cambios realizados en la base de datos antes de que se escriban en el disco. Esto permite una recuperación rápida en caso de fallos o interrupciones, ya que los cambios pueden ser recuperados desde el redo log buffer.

**PGA** (Program Global Area): es un área de memoria privada que contiene datos y estructuras de control utilizadas por un proceso específico. Cada proceso tiene su propia PGA, que se utiliza para almacenar información relacionada con la ejecución de ese proceso, como variables de sesión, pilas de ejecución y otras estructuras necesarias para el funcionamiento del proceso.

### Procesos de Oracle

* **proceso de usuario**: es el proceso que se ejecuta en el cliente y se encarga de enviar solicitudes a la base de datos y recibir respuestas.

* **proceso de servidor**: es el proceso que se ejecuta en el servidor y se encarga de procesar las solicitudes recibidas del proceso de usuario, acceder a la base de datos y enviar respuestas de vuelta al proceso de usuario.

* **proceso de fondo (background)**: son procesos que se ejecutan en el servidor y se encargan de realizar tareas de mantenimiento y gestión de la base de datos, como la recuperación de datos, la gestión de memoria y la administración de recursos.

      procesos Background: son procesos que se ejecutan en el servidor y se encargan de realizar tareas de mantenimiento y gestión de la base de datos, como la recuperación de datos, la gestión de memoria y la administración de recursos. Algunos ejemplos de procesos de fondo incluyen:

      monitor de procesos (PMON): se encarga de monitorear los procesos de usuario y servidor, y de limpiar los recursos asociados a los procesos que han terminado o han fallado. 

      monitorizacion del sistema (SMON): se encarga de realizar tareas de mantenimiento y recuperación de la base de datos, como la limpieza de archivos temporales y la recuperación de datos en caso de fallos.

      escritura en la base de datos (DBWR): se encarga de escribir los bloques de datos modificados en el buffer cache de la memoria a los archivos de datos en el disco.

      escritura de la traza (LGWR): se encarga de escribir los cambios realizados en la base de datos en los archivos de redo log para garantizar la durabilidad de las transacciones.

      punto de sincronización (CKPT): se encarga de marcar un punto de sincronización en la base de datos, lo que permite una recuperación más rápida en caso de fallos o interrupciones.
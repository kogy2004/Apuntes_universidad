---
title: "Apuntes"
---

## Semana 1

### Tareas - Semana 1

### ¿Qué es el ciclo de vida del software?

El ciclo de vida del software es el conjunto de pasos ordenados y repetibles que se siguen para crear, entregar y mantener un programa. Piensa en ello como una receta: cada paso tiene una meta (qué entregar) y actividades concretas para pasar al siguiente. Su objetivo es reducir errores, controlar el proyecto y asegurar que el software sirva a los usuarios.

### Fases típicas (básicas)

#### Requisitos

Qué necesita el cliente/usuario.
Entregables: especificación de requisitos funcionales y no funcionales.

#### Análisis (Analistas) / especificación

Entender y modelar esos requisitos (casos de uso, diagramas).
Entregables: documentos de análisis, modelos de datos.

proceso-> cotizacion

salida -> prototipos

#### Diseño

Arquitectura y diseño detallado (componentes, interfaces, base de datos).
Entregables: diagramas de arquitectura, diseño de módulos.

#### Implementación (codificación)

Programar el sistema siguiendo el diseño.
Entregables: código fuente, documentación técnica.

#### Pruebas (testing)

Verificar que el software cumple requisitos y no tiene errores (unitarias, integración, sistema, aceptación).
Entregables: informes de pruebas, corrección de bugs.

#### Despliegue (deploy)

Poner el software en producción o entregarlo a los usuarios.
Entregables: instaladores, configuraciones, manuales de usuario.

#### Mantenimiento

Corrección de errores, mejoras, adaptación a cambios.
Entregables: versiones nuevas, parches, documentación actualizada.

## Semana 2

### Tareas - Semana 2

#### Diferencia entre requisito y requerimiento

Requerimiento = ¿Qué se necesita? (necesidad general).

Requisito = ¿Cómo se cumple? (condición específica o detalle técnico).

#### Diferencia entre grupo y equipo

En resumen, todo equipo es un grupo, pero no todo grupo es un equipo.  
La clave está en la interdependencia, el objetivo compartido y la colaboración activa.

#### Diferencia entre verificacion y validacion

| Aspecto        | Verificación                       | Validación                                   |
| -------------- | ---------------------------------- | -------------------------------------------- |
| Objetivo       | ¿Se construye bien?                | ¿Se construye lo correcto?                   |
| Tipo de prueba | Estática (sin ejecución)           | Dinámica (con ejecución)                     |
| Momento        | Fases tempranas del desarrollo     | Fases finales del desarrollo                 |
| Métodos        | Revisiones, inspecciones, análisis | Pruebas de caja negra, pruebas de aceptación |
| Enfoque        | Cumplimiento de especificaciones   | Satisfacción de necesidades del cliente      |

## Semana 3

> 23/02/2024

### tipos de metodologias

Tradicionales (cascada, V, espiral)

- Cascada: secuencial, cada fase termina antes de la siguiente, difícil de adaptar a cambios.
- Modelo espiral: iterativo, permite revisiones y ajustes, pero puede ser complejo de gestionar.
- Modelo en V: similar a cascada pero con pruebas integradas, difícil de adaptar a cambios.

Agiles (Scrum, Kanban, XP)

> Enfoque agil: iterativo, colaborativo, flexible, adaptativo a cambios, entrega continua de valor.

- Scrum: roles definidos (Scrum Master, Product Owner, Equipo), sprints de 2-4 semanas, reuniones diarias (Daily Scrum), revisión y retrospectiva al final de cada sprint.

---

## Semana 4

### Preguntas iniciales

1. si tuvieras que construir un rascacielos, ¿empecarias a poner ladrillos hoy o dedicarias meses solo a los planos?
2. En el desarrollo de software, ¿que creen que pesa mas: la velocidad de entrega o la documentacion detallada de cada proceso?
3. ¿Han escuchado el termino "Metodologias pesadas"?¿Que se les viene a la mente con esa palabra?

### Metodologia SSADM

Structured Systems Analysis and Design Methodology

Enfoque estructurado para el análisis y diseño de sistemas

Fases: planificación, análisis, diseño lógico, diseño físico, implementación

- Planificación: definir objetivos, alcance, recursos, cronograma
- Análisis: recopilar y analizar requisitos, modelar procesos y datos
- Diseño lógico: definir la arquitectura del sistema, componentes y interfaces
- Diseño físico: especificar detalles técnicos, hardware, software
- Implementación: codificación, pruebas, despliegue

Documentación detallada en cada fase

**Tecnicas principales de SSADM:**

LDS (Logical Data Structure): modelado de datos, entidades, relaciones, atributos.

DFD (Data Flow Diagrams): modelado de procesos, flujos de datos, transformaciones.

ER (Entity-Relationship Diagrams): modelado de datos, entidades, relaciones.

ELH (Entity Life Histories): modelado de eventos y estados de entidades a lo largo del tiempo.

### Metodologia MERISE (Model-based, Iterative, Risk-driven Software Engineering)

**Filosofia de merise**

origen: Francia, años 70, para proyectos de sistemas de información

prinpales fundamentos - enfoque basado en modelos: uso de modelos para representar requisitos, diseño y arquitectura

**El ciclo de abstraccion de merise**

- nivel conceptual: ¿Que se hace? modelado de requisitos, procesos y datos sin detalles técnicos
- Nivel lógico/organizativo: ¿Como se hace? diseño de la arquitectura, componentes y interfaces sin detalles de implementación

**Los modelos de datos en merise**

- MCD (Modelo Conceptual de Datos): modelado de entidades, relaciones y atributos a nivel conceptual
- MLD (Modelo Lógico de Datos): modelado de datos a nivel lógico, tablas, claves, relaciones
- MPD (Modelo Fisico de Datos): modelado de datos a nivel físico, estructuras de almacenamiento, índices

**Resumen de diferencias entre SSADM y MERISE:**

| Aspecto          | SSADM                                                                 | MERISE                                      |
| ---------------- | --------------------------------------------------------------------- | ------------------------------------------- |
| Enfoque          | Estructurado                                                          | Basado en modelos                           |
| Fases            | Planificación, análisis, diseño lógico, diseño físico, implementación | Nivel conceptual, nivel lógico/organizativo |
| Modelos de datos | LDS, DFD, ER, ELH                                                     | MCD, MLD, MPD                               |

[Lenguajes basados en Markdown](https://tutorialmarkdown.com/lenguajes)

<!--
> :warning: **Warning:** Do not push the big red button.
>
> :memo: **Note:** Sunrises are beautiful.
>
> :bulb: **Tip:** Remember to appreciate the little things in life.
>
> **DevOps**: integración continua, entrega continua, colaboración entre desarrollo y operaciones, automatización de procesos, monitoreo y feedback constante.
--!>


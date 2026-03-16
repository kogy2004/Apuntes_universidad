## title: "Apuntes"

## Índice

- [Semana 1](#semana-1)
- [Semana 2](#semana-2)
- [Semana 3](#semana-3)
- [Semana 4](#semana-4)
- [Semana 5](#semana-5)
- [Semana 6](#semana-6)
- [Herramientas y recursos](#herramientas-y-recursos)

## Semana 1

### Objetivos

- Entender el ciclo de vida del software y sus fases principales.
- Identificar entregables y responsabilidades en cada fase.

### ¿Qué es el ciclo de vida del software?

El ciclo de vida del software es la secuencia de fases ordenadas y repetibles que se siguen para planificar, construir, verificar, desplegar y mantener un sistema. Su objetivo es mitigar riesgos, mejorar la calidad y facilitar la gestión del proyecto.

### Fases típicas

1. **Requisitos:** identificar necesidades del cliente y del usuario. Entregables: documento de requisitos funcionales y no funcionales, historias de usuario.
2. **Análisis / Especificación:** modelado de requisitos (casos de uso, DFD, modelos conceptuales). Entregables: especificación detallada y diagramas.
3. **Diseño:** arquitectura y diseño de módulos e interfaces. Entregables: diagramas de arquitectura, esquemas de base de datos.
4. **Implementación:** desarrollo del código y pruebas unitarias. Entregables: código fuente y tests.
5. **Pruebas:** verificación y validación (unitarias, integración, sistema, aceptación). Entregables: informes de pruebas y plan de corrección.
6. **Despliegue:** entrega a producción, configuración y puesta en marcha. Entregables: scripts de despliegue y manuales.
7. **Mantenimiento:** corrección de errores, mejoras y adaptación a cambios. Entregables: parches y nuevas versiones.

## Semana 2

### Diferencia entre requerimiento y requisito

- **Requerimiento:** necesidad o problema que debe resolverse (qué se necesita). Ejemplo: "El sistema debe permitir gestionar usuarios".
- **Requisito:** condición específica y verificable que cumple un requerimiento (cómo se cumple). Ejemplo: "El sistema permitirá crear usuarios con correo válido y contraseña de al menos 8 caracteres".

### Diferencia entre grupo y equipo

- **Grupo:** colección de personas con objetivos individuales.
- **Equipo:** grupo con objetivo común, roles definidos e interdependencia.

### Verificación vs Validación

| Aspecto  | Verificación                                | Validación                                 |
| -------- | ------------------------------------------- | ------------------------------------------ |
| Objetivo | ¿Se construye correctamente?                | ¿Se construye lo correcto para el usuario? |
| Tipo     | Estática (revisiones, análisis)             | Dinámica (pruebas con ejecución)           |
| Momento  | Fases tempranas y continuas                 | Fases finales y aceptación                 |
| Ejemplos | Revisiones de requisitos, análisis estático | Pruebas de aceptación, pruebas de usuario  |

## Semana 3

**Fecha:** 23/02/2024

### Tipos de metodologías

- **Tradicionales:** Cascada, V, Espiral. Enfocadas en fases secuenciales o iterativas con planificación extensa.
  - _Cascada:_ flujo secuencial; adecuado cuando los requisitos son estables.
  - _Modelo en V:_ destaca la trazabilidad entre fases y pruebas.
  - _Espiral:_ iterativo con énfasis en gestión de riesgos.

- **Ágiles:** Scrum, Kanban, XP. Enfoque iterativo y adaptativo, con entregas frecuentes.
  - _Scrum:_ roles (Product Owner, Scrum Master, Equipo), sprints de 2–4 semanas, ceremonies (Daily, Review, Retrospective).
  - _Kanban:_ flujo continuo y límites WIP para optimizar el trabajo en curso.
  - _XP:_ prácticas de ingeniería (TDD, pair programming, integración continua).

### Comparativa rápida

- **Riesgo al cambio:** Tradicionales = mayor coste de cambios tardíos; Ágiles = menor coste por iteraciones.
- **Documentación:** Tradicionales requieren más documentación formal; Ágiles priorizan la comunicación directa y la documentación mínima necesaria.

## Semana 4

### Preguntas iniciales

1. Si tuvieras que construir un rascacielos, ¿empezarías a poner ladrillos hoy o dedicarías meses solo a los planos?
2. En el desarrollo de software, ¿qué pesa más: la velocidad de entrega o la documentación detallada de cada proceso?
3. ¿Has escuchado el término "metodologías pesadas"? ¿Qué te viene a la mente?

### SSADM y MERISE

#### SSADM (Structured Systems Analysis and Design Method)

- **Origen:** Reino Unido.
- **Enfoque:** metodológico y estructurado para el análisis y diseño de sistemas.
- **Fases:** planificación, estudio de viabilidad, análisis, diseño lógico, diseño físico, implementación y pruebas.
- **Técnicas:** DFD (diagramas de flujo de datos), modelos ER, ELH (Entity Life Histories).

#### MERISE

- **Origen:** Francia (años 70–80).
- **Enfoque:** modelado por niveles de abstracción (conceptual, lógico, físico).
- **Niveles:**
  - _Conceptual:_ Modelo Conceptual de Datos (MCD), definición de entidades y relaciones.
  - _Lógico/Organizativo:_ Modelo Lógico de Datos (MLD), reglas y normalización.
  - _Físico:_ MPD, detalles de implementación en la base de datos.

#### Diferencias clave

- **Enfoque:** SSADM = más prescriptivo y estructurado; MERISE = separación clara entre niveles Conceptual/ Lógico/ Físico.
- **Modelado:** SSADM usa DFD y ELH; MERISE usa MCD/MLD/MPD.

#### Recomendación

- Añadir ejemplos prácticos (mini-DFD y MCD) y enlaces a herramientas de modelado (draw.io, diagrams.net).

## Semana 5

### ¿Qué son las herramientas de procesos?

Son plataformas que facilitan la gestión, seguimiento y automatización de tareas y flujos de trabajo en una organización.

### Criterios para elegir una herramienta

- Tamaño del equipo y distribución geográfica.
- Necesidad de integración con CI/CD y repositorios.
- Coste y curva de adopción.

### Herramientas recomendadas

- **Jira:** gestión ágil a escala y seguimiento de sprints.
- **Trello:** tableros Kanban simples para equipos pequeños.
- **Asana:** gestión de proyectos con dependencias.
- **Microsoft Project:** planificación detallada con diagramas de Gantt.
- **GitHub/GitLab Issues + CI:** integración con repositorios y automatización.

### Buenas prácticas

- Definir workflows antes de configurar la herramienta.
- Automatizar integraciones y notificaciones.
- Documentar convenciones y capacitar al equipo.

## Semana 6

**Consulta:** hacer un mini proyecto de software en jira

### ¿Que es RUP?

RUP (Rational Unified Process) es un marco de proceso de desarrollo de software iterativo e incremental desarrollado por Rational Software (ahora parte de IBM). RUP se basa en principios de ingeniería de software y proporciona una guía estructurada para gestionar el ciclo de vida del software, desde la concepción hasta la entrega y mantenimiento.

RUP esta basado en UML (Unified Modeling Language) y se organiza en cuatro fases principales: Incepción, Elaboración, Construcción y Transición. Cada fase tiene objetivos específicos, entregables y actividades recomendadas.

### Fases de RUP

Cada fase de RUP tiene objetivos específicos y entregables asociados:

1. **Incepción:** definir el alcance del proyecto, identificar riesgos y establecer una visión general. Entregables: caso de negocio, visión del producto, plan de proyecto inicial.
2. **Elaboración:** analizar y diseñar la arquitectura del sistema, mitigar riesgos críticos. Entregables: modelo de análisis, modelo de diseño, plan de proyecto detallado.
3. **Construcción:** desarrollar el sistema, realizar pruebas unitarias e integración. Entregables: código fuente, pruebas unitarias, documentación técnica.
4. **Transición:** preparar el sistema para su entrega, realizar pruebas de aceptación y despliegue. Entregables: versión final del producto, manuales de usuario, plan de soporte.

### Productos

1. modelos de analisis: representan la estructura y comportamiento del sistema desde una perspectiva de análisis, utilizando diagramas UML como casos de uso, diagramas de clases y diagramas de secuencia.

3. modelo de implementación: representa la estructura del sistema desde una perspectiva de implementación, utilizando diagramas de componentes y diagramas de despliegue.
4. modelo de despliegue: representa la distribución física del sistema, incluyendo nodos y artefactos.

### Metricas
 

## Herramientas y recursos

- [Tutorial Markdown](https://tutorialmarkdown.com/lenguajes)

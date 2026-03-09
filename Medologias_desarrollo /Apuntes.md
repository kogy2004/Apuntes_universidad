title: "Apuntes"
---

## Índice

- [Semana 1](#semana-1)
- [Semana 2](#semana-2)
- [Semana 3](#semana-3)
- [Semana 4](#semana-4)
- [Semana 5](#semana-5)
- [SSADM y MERISE](#ssadm-y-merise)
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
| Aspecto | Verificación | Validación |
|---|---|---|
| Objetivo | ¿Se construye correctamente? | ¿Se construye lo correcto para el usuario? |
| Tipo | Estática (revisiones, análisis) | Dinámica (pruebas con ejecución) |
| Momento | Fases tempranas y continuas | Fases finales y aceptación |
| Ejemplos | Revisiones de requisitos, análisis estático | Pruebas de aceptación, pruebas de usuario |


## Semana 3

**Fecha:** 23/02/2024

### Tipos de metodologías

- **Tradicionales:** Cascada, V, Espiral. Enfocadas en fases secuenciales o iterativas con planificación extensa.
	- *Cascada:* flujo secuencial; adecuado cuando los requisitos son estables.
	- *Modelo en V:* destaca la trazabilidad entre fases y pruebas.
	- *Espiral:* iterativo con énfasis en gestión de riesgos.

- **Ágiles:** Scrum, Kanban, XP. Enfoque iterativo y adaptativo, con entregas frecuentes.
	- *Scrum:* roles (Product Owner, Scrum Master, Equipo), sprints de 2–4 semanas, ceremonies (Daily, Review, Retrospective).
	- *Kanban:* flujo continuo y límites WIP para optimizar el trabajo en curso.
	- *XP:* prácticas de ingeniería (TDD, pair programming, integración continua).

### Comparativa rápida
- **Riesgo al cambio:** Tradicionales = mayor coste de cambios tardíos; Ágiles = menor coste por iteraciones.
- **Documentación:** Tradicionales requieren más documentación formal; Ágiles priorizan la comunicación directa y la documentación mínima necesaria.


## Semana 4

### Preguntas iniciales
1. Si tuvieras que construir un rascacielos, ¿empezarías a poner ladrillos hoy o dedicarías meses solo a los planos?
2. En el desarrollo de software, ¿qué pesa más: la velocidad de entrega o la documentación detallada de cada proceso?
3. ¿Has escuchado el término "metodologías pesadas"? ¿Qué te viene a la mente?


## SSADM y MERISE

### SSADM (Structured Systems Analysis and Design Method)
- **Origen:** Reino Unido.
- **Enfoque:** metodológico y estructurado para el análisis y diseño de sistemas.
- **Fases:** planificación, estudio de viabilidad, análisis, diseño lógico, diseño físico, implementación y pruebas.
- **Técnicas:** DFD (diagramas de flujo de datos), modelos ER, ELH (Entity Life Histories).

### MERISE
- **Origen:** Francia (años 70–80).
- **Enfoque:** modelado por niveles de abstracción (conceptual, lógico, físico).
- **Niveles:**
	- *Conceptual:* Modelo Conceptual de Datos (MCD), definición de entidades y relaciones.
	- *Lógico/Organizativo:* Modelo Lógico de Datos (MLD), reglas y normalización.
	- *Físico:* MPD, detalles de implementación en la base de datos.

### Diferencias clave
- **Enfoque:** SSADM = más prescriptivo y estructurado; MERISE = separación clara entre niveles Conceptual/ Lógico/ Físico.
- **Modelado:** SSADM usa DFD y ELH; MERISE usa MCD/MLD/MPD.

### Recomendación
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


## Herramientas y recursos
- [Tutorial Markdown](https://tutorialmarkdown.com/lenguajes)



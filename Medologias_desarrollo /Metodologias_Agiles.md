# Metodologías Ágiles de Desarrollo de Software

## ¿Qué son las Metodologías Ágiles?

Las metodologías ágiles son un conjunto de enfoques para el desarrollo de software que priorizan la flexibilidad, la colaboración continua con el cliente y la entrega incremental de valor.
Surgieron como respuesta a los problemas de las metodologías tradicionales (como el modelo en cascada o Waterfall), que eran rígidas, documentadas en exceso y poco adaptables a los cambios.
En 2001, un grupo de expertos publicó el **Manifiesto Ágil**, que establece cuatro valores fundamentales:

- **Individuos e interacciones** sobre procesos y herramientas
- **Software funcionando** sobre documentación extensiva
- **Colaboración con el cliente** sobre negociación de contratos
- **Respuesta ante el cambio** sobre seguir un plan rígido

---

## Principales Metodologías Ágiles

### 1. Scrum

Es la metodología ágil más popular y ampliamente adoptada. Se basa en ciclos de trabajo cortos llamados **Sprints**, que generalmente duran entre 1 y 4 semanas. 
Al final de cada Sprint se entrega un incremento funcional del producto.

Sus elementos clave son los **roles** (Product Owner, Scrum Master y el Equipo de Desarrollo), los **artefactos** (Product Backlog, Sprint Backlog e Incremento) y los **eventos** (Sprint Planning, Daily Scrum, Sprint Review y Sprint Retrospective). Scrum impone una estructura bastante definida y ceremonias obligatorias, lo que lo hace ideal para equipos que necesitan organización clara y rendición de cuentas constante.

---

### 2. Kanban

Kanban no trabaja con iteraciones fijas sino con un **flujo continuo de trabajo**. Su herramienta central es el tablero visual (Kanban Board), donde las tareas avanzan por columnas que representan estados: Por hacer → En progreso → Hecho.

Una de sus características más importantes es el **límite de trabajo en progreso (WIP Limit)**, que evita que el equipo se sature con demasiadas tareas simultáneas. Kanban es más flexible que Scrum ya que no requiere roles específicos ni ceremonias obligatorias, por lo que se adapta muy bien a equipos de soporte, mantenimiento o con flujos de trabajo impredecibles.

---

### 3. Extreme Programming (XP)

XP es una metodología muy técnica que pone el foco en la **calidad del código y las buenas prácticas de ingeniería**. Sus prácticas más reconocidas incluyen el **Pair Programming** (dos desarrolladores trabajando juntos en el mismo código), **Test-Driven Development o TDD** (escribir las pruebas antes que el código), integración continua y refactorización constante.

XP trabaja con iteraciones cortas y requiere una comunicación muy estrecha con el cliente, quien idealmente está disponible de manera permanente para el equipo. Es ideal para proyectos con requisitos cambiantes y que necesitan alta calidad técnica desde el inicio.

---

### 4. Lean Software Development

Inspirado en el sistema de producción de Toyota, Lean aplica los principios de manufactura esbelta al desarrollo de software. Su filosofía central es **eliminar el desperdicio**, es decir, todo aquello que no agrega valor al cliente: procesos innecesarios, documentación excesiva, esperas, defectos, etc.

Sus siete principios son: eliminar desperdicios, amplificar el aprendizaje, decidir lo más tarde posible, entregar lo más rápido posible, empoderar al equipo, construir con integridad y ver el todo. Lean es más una filosofía de gestión que una metodología concreta, y sirve de base conceptual para varias otras metodologías ágiles.

---

### 5. SAFe (Scaled Agile Framework)

SAFe es un marco diseñado para **escalar las prácticas ágiles a organizaciones grandes**, con múltiples equipos trabajando en el mismo producto o portafolio. Organiza el trabajo en tres niveles: equipo, programa y portafolio, permitiendo sincronizar a decenas o incluso cientos de personas bajo principios ágiles.

Es la metodología más compleja y estructurada de la lista, y aunque es muy poderosa para empresas grandes, suele considerarse "demasiado pesada" para equipos pequeños.

---

### 6. Crystal

Crystal es en realidad una **familia de metodologías** que varía según el tamaño del equipo y la criticidad del sistema. Las variantes van de Crystal Clear (equipos de hasta 6 personas) hasta Crystal Red (equipos grandes). Su premisa es que no existe una única metodología válida para todos los proyectos y que el proceso debe adaptarse al contexto específico del equipo.

---

## Diferencias Clave entre las Metodologías

| Característica             | Scrum                | Kanban                  | XP                 | Lean                 | SAFe             |
| -------------------------- | -------------------- | ----------------------- | ------------------ | -------------------- | ---------------- |
| **Estructura**             | Alta                 | Baja                    | Alta               | Media                | Muy alta         |
| **Iteraciones**            | Sprints fijos        | Flujo continuo          | Iteraciones cortas | Flexible             | PI Planning      |
| **Roles definidos**        | Sí                   | No                      | Sí                 | No                   | Sí               |
| **Foco principal**         | Gestión del proyecto | Visualización del flujo | Calidad técnica    | Eliminar desperdicio | Escalar agilidad |
| **Tamaño de equipo ideal** | Pequeño/mediano      | Cualquiera              | Pequeño            | Cualquiera           | Grande           |
| **Documentación**          | Mínima               | Mínima                  | Mínima             | Mínima               | Moderada         |

---

## Conclusión

Todas las metodologías ágiles comparten el espíritu del Manifiesto Ágil, pero se diferencian en su estructura, enfoque y contexto de aplicación.
**Scrum** es ideal para proyectos nuevos con entregas frecuentes.
**Kanban** brilla en flujos continuos y equipos de soporte.
**XP** es la mejor opción cuando la calidad técnica es prioritaria.
**Lean** funciona como filosofía transversal para mejorar procesos.
**SAFe** resuelve el reto de escalar agilidad en organizaciones grandes.
La elección depende siempre del tamaño del equipo, la naturaleza del proyecto y la cultura organizacional.

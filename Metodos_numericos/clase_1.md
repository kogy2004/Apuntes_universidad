# Método de Bisección

## 1. Introducción

El **método de bisección** es un método numérico utilizado para encontrar raíces reales de una función de variable real, es decir, soluciones de la ecuación:

$$
f(x) = 0
$$

Es un método cerrado porque requiere un intervalo inicial $[a,b]$ en el cual la función cambie de signo.

---

## 2. Fundamento Teórico

El método se fundamenta en el **Teorema del Valor Intermedio**, el cual establece:

Sea $f : [a,b] \to \mathbb{R}$ una función continua.  
Si

$$
f(a)\,f(b) < 0
$$

entonces existe al menos un $c \in (a,b)$ tal que

$$
f(c) = 0.
$$

Esta condición garantiza la existencia de al menos una raíz dentro del intervalo.

---

## 3. Descripción del Método

Dado un intervalo inicial $[a_0, b_0]$ tal que

$$
f(a_0)\,f(b_0) < 0,
$$

se define el punto medio como:

$$
c_n = \frac{a_n + b_n}{2}.
$$

Luego se evalúa $f(c_n)$ y se actualiza el intervalo de la siguiente forma:

- Si  
  $$
  f(a_n)\,f(c_n) < 0,
  $$  
  entonces
  $$
  a_{n+1} = a_n, \quad b_{n+1} = c_n.
  $$

- Si  
  $$
  f(c_n)\,f(b_n) < 0,
  $$  
  entonces
  $$
  a_{n+1} = c_n, \quad b_{n+1} = b_n.
  $$

Este proceso se repite iterativamente hasta satisfacer un criterio de convergencia.

---

## 4. Criterios de Parada

### 4.1 Error absoluto

$$
|c_n - c_{n-1}| < \varepsilon
$$

### 4.2 Valor funcional pequeño

$$
|f(c_n)| < \varepsilon
$$

### 4.3 Número máximo de iteraciones

$$
n \geq N_{\text{max}}
$$

---

## 5. Análisis del Error

Después de $n$ iteraciones, la longitud del intervalo es:

$$
b_n - a_n = \frac{b_0 - a_0}{2^n}.
$$

Sea $r$ la raíz exacta. Entonces el error está acotado por:

$$
|r - c_n| \leq \frac{b_0 - a_0}{2^{n+1}}.
$$

Esto demuestra que el método tiene **convergencia lineal**, ya que el error se reduce a la mitad en cada iteración.

---

## 6. Formulación Matemática Compacta

Sea $f \in C([a,b])$ con $f(a)f(b) < 0$. El método genera la sucesión:

$$
c_n = \frac{a_n + b_n}{2}
$$

con actualización:

$$
(a_{n+1}, b_{n+1}) =
\begin{cases}
(a_n, c_n), & \text{si } f(a_n)f(c_n) < 0, \\
(c_n, b_n), & \text{si } f(c_n)f(b_n) < 0.
\end{cases}
$$

---

## 7. Orden de Convergencia

El método de bisección es de **orden 1**, es decir, posee convergencia lineal:

$$
\lim_{n \to \infty} \frac{|e_{n+1}|}{|e_n|} = \frac{1}{2}.
$$

---

## 8. Conclusión

El método de bisección es un algoritmo robusto y matemáticamente garantizado para la aproximación de raíces cuando se cumple la condición de cambio de signo. Aunque su velocidad de convergencia es menor que la de métodos abiertos como Newton-Raphson, su estabilidad lo convierte en una herramienta fundamental en análisis numérico.

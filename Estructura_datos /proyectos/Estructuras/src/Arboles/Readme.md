# Arboles

Son estructuras de datos jerarquicas, hay un elemento central del cual se derivan dos o mas elementos

El primer elemento se llama raiz, y los elementos que se derivan de la raiz se llaman hijos.

Las hojas son los elementos que no tienen hijos.

## Clasificacion de arboles

### Ancho de un arbol

- Arbol binario: cada nodo tiene a lo mas dos hijos
- Arbol ternario: cada nodo tiene a lo mas tres hijos
- Arbol n-ario: cada nodo tiene a lo mas n hijos

### Altura de un arbol

la altura de un arbol es el numero de niveles que tiene el arbol, es decir, el numero de nodos que hay desde la raiz hasta la hoja mas lejana.

- Balanceado: <= 1
- No balanceado: > 1

la diferencia del V.A de los niveles de las hojas

## Recorridos de un arbol

La raiz : es el nodo principal del arbol, es el nodo que no tiene padre.
hijo izquierdo: es el nodo que se encuentra a la izquierda de la raiz.
hijo derecho: es todo nodo que se encuentra a la derecha de la raiz.

- Preorden: raiz, hijo izquierdo, hijo derecho
- Inorden: hijo izquierdo, raiz, hijo derecho
- Postorden: hijo izquierdo, hijo derecho, raiz

## Arboles binarios

Un arbol binario es un arbol en el que cada nodo tiene a lo mas dos hijos, uno a la izquierda y otro a la derecha.

### Binary Node

Un nodo de un arbol binario es una estructura que contiene un valor, un puntero al hijo izquierdo y un puntero al hijo derecho.

### Binary Tree

Un arbol binario es una estructura de datos que consiste en nodos, donde cada nodo tiene a lo mas dos hijos, uno a la izquierda y otro a la derecha. El primer nodo del arbol se llama raiz, y los nodos que se derivan de la raiz se llaman hijos. Las hojas son los nodos que no tienen hijos.

### Diagrama de clases

| BinaryNode                    |
|---                            |
| data: object                  |
| left: BinaryNode              |
| right: BinaryNode             |
| ----------------------------- |
| + BinaryNode(data: object)    |
| + get..() : object            |
| + set..(data: object) : void  |

| BinaryTree                                                |
|---                                                        |
| root: BinaryNode                                          |
| --------------------------------------------------------- |
| + BinaryTree()                                            |
| + isEmpty() : boolean                                     |
| + add(data: object) : void                                |
| - Add(object data, BinaryNode aux)                        |
| + preOrder() : string                                     |
| - preOrder(BinaryNode aux) : string                       |
| + inOrder() : string                                      |
| - inOrder(BinaryNode aux) : string                        |
| + postOrder() : string                                    |
| - postOrder(BinaryNode aux) : string                      |
| + size() : int                                            |
| - size(BinaryNode aux) : int                              |
| + height() : int                                          |
| - height(BinaryNode aux) : int                            |
| + search(data: object) : boolean                          |
| - search(object data, BinaryNode aux) : boolean           |
| + searchNode(xxx yyy): BinaryNode                         |
| - searchNode(object data, BinaryNode aux) : BinaryNode    |
| + getFather(binaryNode: f) : BinaryNode                   |
| - getFather(BinaryNode f, BinaryNode aux) : BinaryNode    |
| + path(binaryNode: f) : list                              |

| + successor(binaryNode: f) : BinaryNode                   |

| + delete(xxx yyy) : boolean                               |

# Clase 1

¿que son las listas?

> list600.java

```java title="list600.java"
package com.mycompany.list600;

import javax.swing.JOptionPane;

public class List600 {

    public static void main(String[] args) {
        String value;
        List ele1 = new List();
        String menu[] = {"toString", "AddFirst", "AddLast", "AddPos", "DeleteFirst", "DeleteLast", "DeletePos", "Size", "Exit"};
        String option;
        do {
            option = (String) JOptionPane.showInputDialog(null, "Selected option: ", "Main Menu", 1, null, menu, menu[0]);
            switch (option) {
                case "AddFirst" -> {
                    value = JOptionPane.showInputDialog("Enter data: ");
                    ele1.addFirst(value);
                    JOptionPane.showMessageDialog(null, "elemento creado: " + value);
                }
                case "AddLast" -> {
                    value = JOptionPane.showInputDialog("Enter data: ");
                    ele1.addLast(value);
                    JOptionPane.showMessageDialog(null, "elemento creado: " + value);
                }

                case "AddPos" -> {
                    int pos;
                    do {
                        pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion (1-" + (ele1.size() + 1) + ")"));
                    } while (pos < 1 || pos > ele1.size() + 1);
                    value = JOptionPane.showInputDialog("Enter data: ");
                    ele1.addPos(pos, value);
                    JOptionPane.showMessageDialog(null, "elemento creado: " + value);
                }
                case "DeleteFirst" -> {
                    if (ele1.deleteFirst()) {
                        JOptionPane.showMessageDialog(null, "elemento borrado");
                    } else {
                        JOptionPane.showMessageDialog(null, "la lista esta vacia");
                    }
                }

                case "DeleteLast" -> {
                    if (ele1.deleteLast()) {
                        JOptionPane.showMessageDialog(null, "elemento borrado");
                    } else {
                        JOptionPane.showMessageDialog(null, "la lista esta vacia");
                    }
                }
                case "DeletePos" -> {
                    int pos;
                    do {
                        pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion (1-" + (ele1.size()) + ")"));
                    } while (pos < 1 || pos > ele1.size());
                    if (ele1.deletePos(pos)) {
                        JOptionPane.showMessageDialog(null, "elemento borrado");
                    } else {
                        JOptionPane.showMessageDialog(null, "la lista esta vacia");
                    }
                }
                case "Size" -> {
                    JOptionPane.showMessageDialog(null, "El tamaño es de: " + ele1.size());
                }
                case "toString" -> {
                    JOptionPane.showMessageDialog(null, ele1.toString(), "List", 1);
                }
            }
        } while (!option.equals("Exit"));

    }
}

```

>list.java

```java
package com.mycompany.list600;

public class List {

    private Node head;

    public List() {
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Object data) {
        if (isEmpty()) {
            head = new Node(data);
        } else {
            Node n = new Node(data);
            n.setLink(head);
            head = n;
        }
    }

    public Node Last() {
        Node aux = head;

        while (aux != null && aux.getLink() != null) {
            aux = aux.getLink();
        }

        return aux;
    }

    public void addLast(Object data) {
        if (isEmpty()) {
            head = new Node(data);
        } else {
            Node last = Last();
            Node n = new Node(data);
            last.setLink(n);
        }
    }

    public Node addPos(int pos, Object data) {
        if (pos == 1) {
            addFirst(data);
        } else {
            if (pos == size() + 1) {
                addLast(data);
            } else {
                int count = 1;
                Node aux = head;
                while (aux != null && count < pos) {
                    count++;
                    aux = aux.getLink();
                }
                Node n = new Node(data);
                n.setLink(aux);
                Node pre = previous(aux);
                pre.setLink(n);
            }
        }
        return null;
    }

    public Node previous(Node search) {
        Node aux = head;
        Node pre = null;

        while (aux != null && aux != search) {
            pre = aux;
            aux = aux.getLink();
        }
        return pre;
    }

    public boolean deleteFirst() {
        if (!isEmpty()) {
            head = head.getLink();
            return true;
        }
        return false;
    }

    public boolean deleteLast() {
        if (!isEmpty()) {
            Node last = Last();
            Node pre = previous(last);
            if (pre != null) {
                pre.setLink(null);
            } else {
                head = null;
                return true;
            }
        }
        return false;
    }

    public boolean deletePos(int pos) {
        if (!isEmpty()) {
            if (pos == 1) {
                return deleteFirst();
            } else {
                if (pos == size()) {
                    return deleteLast();
                } else {
                    int count = 1;
                    Node aux = head;
                    while (aux != null && count < pos) {
                        count++;
                        aux = aux.getLink();
                    }
                    Node pre = previous(aux);
                    pre.setLink(aux.getLink());
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        Node aux = head;
        int count = 0;
        while (aux != null) {
            count++;
            aux = aux.getLink();
        }
        return count;
    }

    @Override
    public String toString() {
        String text = " ";
        Node aux = head;

        while (aux != null) {
            text = text + aux.getData() + " - ";
            aux = aux.getLink();
        }

        return text;
    }

}


```

>Node.java

```java

package com.mycompany.list600;

public class Node {
    private Object data;
    private Node link;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
    
    
    
}
```

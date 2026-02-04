
list600
´´´java
package com.mycompany.list600;

import javax.swing.JOptionPane;

public class List600 {

    public static void main(String[] args) {
        String value;
        List ele1 =new List();
        String menu[]= {"AddFirst","AddLast","AddPos", "DeeleteFirst","DeleteLast", "DeletePos","toString", "Size", "Exit"};
        String option;
        do {
            option = (String)JOptionPane.showInputDialog(null,"Selected option: ","Main Menu",1, null, menu, menu[0]);
            switch (option) {
                case "AddFirst" -> {
                    value = JOptionPane.showInputDialog("Enter data: ");
                    ele1.addFirst(value);
                    JOptionPane.showMessageDialog(null, "elemento creado: " + value);
                }
                case "toString"->{
                    JOptionPane.showMessageDialog(null, ele1.toString(), "List" , 1);
                }
            }
        } while (!option.equals("Exit"));
            
    }
}

´´´´


list
´´´´´java
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

´´´´´

Node
´´´´java

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

´´´´
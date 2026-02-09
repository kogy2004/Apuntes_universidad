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

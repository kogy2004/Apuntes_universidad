/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Estructuras;

import javax.swing.JOptionPane;

/**
 *
 * @author salas
 */
public class Estructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String menu[] = {"AddFirst", "AddLast", "Add", "DeleteFirst", "DeleteLast", "Delete", "toString", "toStringInv", "Size", "Exit"};
        String option;
        do {
            option = (String) JOptionPane.showInputDialog(null, "Selected: ", "Menu", 0, null, menu, menu[0]);
        } while (!option.equals("Exit"));

    }
}

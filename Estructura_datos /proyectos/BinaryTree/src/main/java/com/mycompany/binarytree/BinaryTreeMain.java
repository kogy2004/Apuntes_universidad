/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.binarytree;

import com.mycompany.binarytreeg600.List;
import javax.swing.JOptionPane;

/**
 *
 * @author salas
 */
public class BinaryTreeMain {

    public static void main(String[] args) {
        String menu[] = {"Add", "PreOrder", "Inorder", "PostOrder", "Size", "Heigth", "Search", "SearchNode", "getFather", "Path", "Successor", "Delete", "Exit"};
        String option, value;
        BinaryTree bt = new BinaryTree();

        do {
            option = (String) JOptionPane.showInputDialog(null, "selected option: ", "Menu", 1, null, menu, menu[0]);

            switch (option) {
                case "Add" -> {
                    value = JOptionPane.showInputDialog("Enter value:");
                    bt.Add(value);
                    JOptionPane.showMessageDialog(null, "Created element");
                }
                case "PreOrder" -> {
                    JOptionPane.showMessageDialog(null, bt.PreOrder());

                }
                case "Inorder" -> {
                    JOptionPane.showMessageDialog(null, bt.InOrder());

                }
                case "PostOrder" -> {
                    JOptionPane.showMessageDialog(null, bt.PostOrder());

                }
                case "Size" -> {
                    JOptionPane.showMessageDialog(null, bt.Size());

                }
                case "Search" -> {
                    value = JOptionPane.showInputDialog("Enter value:");

                    if (bt.Search(value)) {
                        JOptionPane.showMessageDialog(null, "Element found");
                    } else {
                        JOptionPane.showMessageDialog(null, "Element not found");
                    }
                }

                case "SearchNode" -> {
                    value = JOptionPane.showInputDialog("Enter value:");

                    if (bt.SearchNode(value) != null) {
                        JOptionPane.showMessageDialog(null, "Element found");
                    } else {
                        JOptionPane.showMessageDialog(null, "Element not found");
                    }
                }
                case "getFather" -> {
                    value = JOptionPane.showInputDialog("Enter value:");
                    BinaryNode father = bt.getFather(value);

                    if (father != null) {
                        JOptionPane.showMessageDialog(null, "the father of " + value + " is: " + father.getData());
                    } else {
                        JOptionPane.showMessageDialog(null, "Element not found or element is root");
                    }

                }
                
                 case "Path" -> {
                    value = JOptionPane.showInputDialog("Enter value:");
                     List list = bt.Path(value);

                    if (list != null) {
                        JOptionPane.showMessageDialog(null, list.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "Element not found or element is root");
                    }

                }

            }

        } while (!option.equals("Exit"));

    }
}

package ListasDobles;

import javax.swing.JOptionPane;

public class DoubleListaMain {

    public static void main(String[] args) {
        String menu[] = {"AddFirst", "AddLast", "Add", "DeleteFirst", "DeleteLast", "Delete", "toString", "toStringInv", "Size", "Exit"};
        String option, value;
        DoubleList list = new DoubleList();
        do {
            option = (String) JOptionPane.showInputDialog(null, "Selected: ", "Menu", 0, null, menu, menu[0]);

            switch (option) {
                case "AddFirst" -> {
                    value = JOptionPane.showInputDialog("Enter value: ");
                    list.AddFirst(value);
                    JOptionPane.showMessageDialog(null, "Element created");
                }
                case "AddLast" -> {
                    value = JOptionPane.showInputDialog("Enter value: ");
                    list.AddLast(value);
                    JOptionPane.showMessageDialog(null, "Element created");
                }
                case "Add" -> {
                    value = JOptionPane.showInputDialog("Enter value: ");
                    list.Add(value);
                    JOptionPane.showMessageDialog(null, "Element created");
                }

                case "DeleteFirst" -> {
                    if (list.DeleteFirst()) {
                        JOptionPane.showMessageDialog(null, "Element delete");
                    } else {
                        JOptionPane.showMessageDialog(null, "list is empty");

                    }
                }
                case "DeleteLast" -> {
                    if (list.DeleteLast()) {
                        JOptionPane.showMessageDialog(null, "Element delete");
                    } else {
                        JOptionPane.showMessageDialog(null, "list is empty");

                    }
                }
                case "Delete" -> {
                    value = JOptionPane.showInputDialog("Enter value: ");
                    if (list.Delete(value)) {
                        JOptionPane.showMessageDialog(null, "Element delete");
                    } else {
                        JOptionPane.showMessageDialog(null, "list is empty");

                    }
                }

                case "toString" -> {
                    JOptionPane.showMessageDialog(null, list.toString());
                }
                case "toStringInv" -> {
                    JOptionPane.showMessageDialog(null, list.toStringInv());
                }

            }

        } while (!option.equals("Exit"));
    }

}

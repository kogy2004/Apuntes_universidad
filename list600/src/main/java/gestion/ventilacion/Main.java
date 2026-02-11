package gestion.ventilacion;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        List list = new List();

        String menu[] = {"Add equipament", "toString", "Search equipament", "Update location", "Update state", "Sub list", "Delete", "Exit"};
        String option, code, description, location, state, type, brand;

        do {

            option = (String) JOptionPane.showInputDialog(null, "Selected", "Main", 1, null, menu, menu[0]);

            switch (option) {
                case "Add equipament" -> {

                    code = JOptionPane.showInputDialog("Enter code");
                    description = JOptionPane.showInputDialog("Enter description");
                    location = JOptionPane.showInputDialog("Enter location");
                    state = JOptionPane.showInputDialog("Enter state");
                    type = JOptionPane.showInputDialog("Enter type");
                    brand = JOptionPane.showInputDialog("Enter brand");

                    Equipament eq = new Equipament(code, description, location, state, type, brand);

                    list.add(eq);

                    JOptionPane.showMessageDialog(null, "Equipment created");
                }
                case "Search equipament" -> {
                    code = JOptionPane.showInputDialog("Enter code");
                    Equipament eq = list.search(code);
                    if (eq != null) {
                        JOptionPane.showMessageDialog(null, eq.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "Equipament not found");

                    }
                }
                case "toString" -> {
                    JOptionPane.showMessageDialog(null, list.toString());
                }
            }
        } while (!option.equals("Exit"));

    }
}

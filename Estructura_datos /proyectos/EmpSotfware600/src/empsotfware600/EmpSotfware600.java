package empsotfware600;

import javax.swing.JOptionPane;

public class EmpSotfware600 {

    public static void main(String[] args) {
        BinaryTree directoriy = new BinaryTree();
        String menu[] = {"Add", "toString", "Search", "Sub", "Year", "Exit"};
        String option, name;
        int code, size;
        File f = null;
        do {
            option = (String) JOptionPane.showInputDialog(null, "Selected", "Menu", 1, null, menu, menu[0]);

            switch (option) {
                case "Add" -> {
                    code = (int) (Math.random() * 500);
                    name = JOptionPane.showInputDialog("Enter name: ");
                    size = (int) (Math.random() * 1500000);
                    f = new File(code, name, size);
                    directoriy.Add(f);
                    JOptionPane.showMessageDialog(null, "File Created:\n" + f.toString());

                }

                case "toString" -> {
                    JOptionPane.showMessageDialog(null, "File History: \n" + directoriy.InOrder());

                }
                case "Search" -> {
                    name = JOptionPane.showInputDialog("Enter name: ");
                    List search = directoriy.SearchiName(name);
                    if (!search.isEmpty()) {
                        JOptionPane.showMessageDialog(null, search.toString());

                    } else {
                        JOptionPane.showMessageDialog(null, "File not f");

                    }

                }
                case "Sub" -> {
                    int criteria = Integer.parseInt(JOptionPane.showInputDialog("Enter size: "));
                    JOptionPane.showMessageDialog(null, directoriy.Sub(criteria).InOrder());
                }
                case "Year" -> {
                    List Date = directoriy.Date();
                    if (!Date.isEmpty()) {
                        JOptionPane.showMessageDialog(null, Date.toString());

                    } else {
                        JOptionPane.showMessageDialog(null, "File not f");
                    }
                }
                case "Exit" -> {
                }

            }

        } while (!option.equals("Exit"));
    }

}

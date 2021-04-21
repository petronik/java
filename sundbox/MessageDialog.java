import javax.swing.JOptionPane;

public class MessageDialog{


public static void main(String[] args) {

    JOptionPane.showMessageDialog(null,
    "Before starting the installation, shut down all applications.");
    String month = JOptionPane.showInputDialog(null,
    "Enter a month you were born:");
    int day = Integer.parseInt(JOptionPane.showInputDialog(null,
    "Enter a day you were born:"));
    int year = Integer.parseInt(JOptionPane.showInputDialog(null,
    "Enter a year you were born:"));

    JOptionPane.showMessageDialog(null,
    "You will be 100 on " + month + " " + day + ", " + (100 + year) + ".");
    
}
}
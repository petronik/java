import javax.swing.JOptionPane;

public class ZipCode {
    public static void main(String[] args) {
        String zip = JOptionPane.showInputDialog(null,
        "Enter your ZIP Code:");

        switch (zip.charAt(0)){
            case '0': case'2': case'3':
            JOptionPane.showMessageDialog(null,
            (zip + " is on the East Coast"));
            break;
            case '4': case'5': case'6':
            JOptionPane.showMessageDialog(null,
            (zip + " is on the Central Pane Area."));
            break;
            case '7': 
            JOptionPane.showMessageDialog(null,
            (zip + " is in the South"));
            break;
            case '8': case '9': 
            JOptionPane.showMessageDialog(null,
            (zip + " is in the West"));
            break;
            default:
            JOptionPane.showMessageDialog(null,
            (zip + " is an invalid ZIP Code"));
        }
    }
}

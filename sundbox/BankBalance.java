import javax.swing.JOptionPane;

public class BankBalance {
    public static void main(String[] args){
        Double balance = Double.parseDouble(JOptionPane.showInputDialog(null,
        "Enter starting balance:"));
        double yearsTo100K = 0;
        double yearsTo1M = 0;
        while(balance <= 1000000){
            if(balance < 100000){
                yearsTo100K++;
            }
            yearsTo1M++;
            balance = balance * 2;
        }
        JOptionPane.showMessageDialog(null,
        "It takes " + yearsTo100K + " years to reach $100K.\n"
        + "It takes " + yearsTo1M + " years to reach $1M.");
    }
}

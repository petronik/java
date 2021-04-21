import javax.swing.JOptionPane;

public class EconomicPolicy {
    public static void main(String[] args) {
        Double rate = Double.parseDouble(JOptionPane.showInputDialog(null,
        "Enter annual growth rate:"));
        Double inflation = Double.parseDouble(JOptionPane.showInputDialog(null,
        "Enter inflation rate:"));

        if(rate < 1){
            if(inflation < 3){
                JOptionPane.showMessageDialog(null,
                "Increase welfare spending, reduce personal taxes, and decrease discount rate.");
            } else {
                JOptionPane.showMessageDialog(null,
                "Reduce business taxes.");
            }
        }else if(rate > 4){
            if(inflation < 1){
                JOptionPane.showMessageDialog(null,
                "Increase personal and business taxes, and decrease discount rate.");
            } else if (inflation > 3){
                JOptionPane.showMessageDialog(null,
                "Increase discount rate.");
            } else {
                JOptionPane.showMessageDialog(null,
                "No change in economic policy.");
            }
        } else {
             JOptionPane.showMessageDialog(null,
             "No change in economic policy.");
         }

    }
}

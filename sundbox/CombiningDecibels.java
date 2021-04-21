import javax.swing.JOptionPane;

public class CombiningDecibels {

    public static void main(String[] args) {
      double dB1 = Double.parseDouble(JOptionPane.showInputDialog(null,
       "Enter first decibel level:"));
       double dB2 = Double.parseDouble(JOptionPane.showInputDialog(null,
       "Enter seond decibel level:"));
       double combinedDB = Math.pow(10, dB1/10) + Math.pow(10, dB2/10);
       JOptionPane.showMessageDialog(null,
       "Combination decibel Level = " + 10 * Math.log10(combinedDB) + " dB.");
    }
}
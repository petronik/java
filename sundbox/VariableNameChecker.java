import javax.swing.JOptionPane;

public class VariableNameChecker {
    public static void main(String[] args) {
         String myvarName = JOptionPane.showInputDialog(null,
         "Enter a variable name (q to quit):");
        char ch = myvarName.charAt(0);

        for(int i = 1; i < myvarName.length(); i++){
            char whtsps = myvarName.charAt(i);
            if(Character.isWhitespace(whtsps)){
                System.out.println("Illegal!");
            }
        }
        if(!Character.isLetter(ch)){
            System.out.println("Illegal!");
        }else if (Character.isUpperCase(ch)){
            System.out.println("Legal, but uses poor style.");
        }
        
        else{System.out.println("Good!");}

        
    }
}

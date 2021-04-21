import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sim = new Scanner(System.in);
        System.out.println("Enter size of figure: ");
        int size=sim.nextInt();

        for(int row=size; row > 0 ; row--){
            for(int col=1; col <=row; col++){
                System.out.print("*");
                
                }
                System.out.println();
            }
        for(int row2 = 1; row2 <= size; row2++){
            for(int col2 = 1; col2 <= row2; col2++){
                System.out.print("*");
            }
        System.out.println();
        }
        sim.close();  
        }       
}

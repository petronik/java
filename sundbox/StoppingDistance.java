import java.util.Scanner;

public class StoppingDistance {
    public static void main(String[] args) {
        Scanner speed = new Scanner(System.in);
        System.out.print("Enter your speed (in mph): ");
        Double spd = Double.parseDouble(speed.nextLine());
        System.out.print("Enter your tailgate distance (in feet): ");
        Double distance = Double.parseDouble(speed.nextLine());
        final int RANGE = 40;
        Double stoppingDistance = spd * (2.25 + spd / 21);
        if(stoppingDistance < (distance - 0.5 *RANGE)) {
            System.out.println("No problem");
        } else if (stoppingDistance > distance + 0.5 * RANGE){
            System.out.println("Major wreck!");
        } else { System.out.println("Minor wreck.");}
        System.out.println(stoppingDistance);
        speed.close();
        
    }
}

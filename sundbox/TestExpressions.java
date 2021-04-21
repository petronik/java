public class TestExpressions {
    public static void main(String[] args ) {
        System.out.println("7 / 2 = " + (7 / 2));
        System.out.println("7 % 2 = " + (7 % 2));
        System.out.println("8 / 12 = " + (8 / 12));
        System.out.println("8 % 12 = " + (8 % 12));

        int time;
        System.out.print("Enter the current time as an integer (no colon): ");
        time = 1208;
        System.out.println(
            "hours = " + time / 100 + ", minutes = " + (time % 100)
         );
    }
}

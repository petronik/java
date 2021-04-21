package firstProject.src.main.java;

import java.util.Scanner;

public class OneHundredBirthday {
    public static void main(String[] args) {
        Scanner month = new Scanner(System.in);
        Scanner day = new Scanner(System.in);
        Scanner year = new Scanner(System.in);

        System.out.println("Enter a month you were born: ");
        String user_month = month.nextLine();
        System.out.println("Enter a day you were born: ");
        int user_day = day.nextInt();
        System.out.println("Enter a day you were born: ");
        int user_year = year.nextInt();

        System.out.println("You will be 100 on " + user_month + " " + user_day + ", " + (100 + user_year) + ".");
        month.close();
        day.close();
        year.close();
    }
}

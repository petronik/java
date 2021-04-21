package robertson.javaCourse.firstProject.src.main;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner phone = new Scanner(System.in);
        String line = "";
        while(true){
            System.out.print("Enter a phone number in the form cc-area-local," + 
            "where cc = country code digits, area = area code digits," + 
            "and local = local phone digits.Or enter q to quit:");
            line = phone.nextLine();
            if(line.toLowerCase().equals("q")) break;

            System.out.println(phoneDissector(line));
        }
        phone.close();
    }

    public static String phoneDissector(String input){

        String sectors = input.trim();
        int firstIndex = sectors.indexOf('-');
		int lastIndex = sectors.lastIndexOf('-'); 
        String numberDissector = "countryCode = " + sectors.substring(0, firstIndex) + "\n" +
                                 "areaCode = " + sectors.substring(firstIndex + 1, lastIndex) + "\n" +
                                 "local number = " + sectors.substring(lastIndex +1);
        return numberDissector;
    }
}
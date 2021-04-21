import java.util.Scanner;

public class userInterfaces {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double somethingInt = enterIntUI(sn, "starting balance");
		double somethingInt2 = enterIntUI(sn, "radius");
		double somethingInt3 = enterIntUI(sn, "speed km/h");

		System.out.println(somethingInt + " " + somethingInt2 + " " + somethingInt3);
				
		sn.close();
		System.out.println("Have a nice day!");
	}
	
	public static double enterIntUI(Scanner sn, String message) {
		String userInput = "";
		double res = 0;
		System.out.println("Enter " + message + ": ");
		 do {
			userInput = sn.next();
			if(doubleChecker(userInput)) {
				res = Double.parseDouble(userInput);
			}
			else {
				System.out.println("Incorrrect value. Please, re-enter " + message + ": ");
			}
		} while(!doubleChecker(userInput));
		return res;
	}
	
	public static boolean intChecker(String value) {	
		for(int j = 0; j < value.length(); ++j) {
			if( value.charAt(j) < '0' || value.charAt(j) > '9' ) {
				return false;
			}
		}
		return true;
	} 

	public static boolean doubleChecker(String value) {
		int count = 0;
		for( int k = 0; k < value.length(); k++){
			if(value.charAt(k) == '.'){
				count++;	
			}
			if( count > 1 || count == 1 && value.length() == 1){return false;}
			// if( value.charAt(k) < '0' || value.charAt(k) > '9' ) {return false;}
		}
		return true;
	}

	
	
}

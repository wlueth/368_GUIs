package CyberPet;
import java.util.Scanner;

public class InputHelper {
	static Scanner sc = new Scanner(System.in);
	
	public static String getString(String prompt){
		System.out.println(prompt);
		return sc.nextLine();
	}
	
	public static String getWord(String prompt){
		System.out.println(prompt);
		return sc.next();
	}
	
	public static char getChar(String prompt){
		System.out.println(prompt);
		char output = sc.next().charAt(0);
		return output;
	}
	
	public static int getInt(String prompt){
		System.out.println(prompt);
		return sc.nextInt();
	}
	
	public static int getIntWithinRange(String prompt, int min, int max){
		System.out.println(prompt);
		int input = sc.nextInt();
		if(input < min || input > max){
			System.out.println("Please enter a valid number");
			return getIntWithinRange(prompt, min, max);
		}
		else{
			return input;
		}
	}
	
	public static double getDouble(String prompt){
		System.out.println(prompt);
		return sc.nextDouble();
	}
	
	public static boolean getBoolean(String prompt){
		System.out.println(prompt);
		String input = sc.next();
		if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
			return true;
		}
		else if(input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")){
			return false;
		}
		else{
			System.out.println("Please enter y/yes or n/no");
			return getBoolean(prompt);
		}
	}
}


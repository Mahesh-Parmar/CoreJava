package special_classes;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		/*
		 * Scanner class is used to accept the user input during execution of a java program
		 */
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Plese enter a string.");
		
		String str1 = s1.nextLine();
		
		String temp = "";
		
		for (int i = 0; i < str1.length(); i++) {
			temp = str1.charAt(i) + temp;
		}
		
		System.out.println("Reverse String is : "+temp);
		s1.close();

	}

}

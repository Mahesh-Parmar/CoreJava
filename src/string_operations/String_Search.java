package string_operations;

public class String_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Contains
		 * Starts with
		 * Ends with
		 * Index of
		 * Last Index of
		 */
		
		//Contains
		String str1 = "I love Java love and Selenium";
		String str2 = "Java";
		
		System.out.println(str1.contains(str2));
		System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));
		
		//Starts with
		
		System.out.println(str1.startsWith("I"));
		
		//Ends with
		
		System.out.println(str1.endsWith("Selenium"));
		
		//Index of
		
		System.out.println(str1.indexOf("love"));
		System.out.println(str1.indexOf("love", 6));
		
		//Last Index of
		
		System.out.println(str1.lastIndexOf("love"));

	}

}

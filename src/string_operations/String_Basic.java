package string_operations;

public class String_Basic {
	
	public static void main(String[] args) {
		/**
		 * Concatenate
		 * Length
		 * Trim
		 * Upper Case
		 * Lower Case
		 * Empty
		 */
		
		//Concatenate
		String str1 = "Mahesh ";
		String str2 = "Parmar";
		
		String str3 =  str1 + str2;
		System.out.println(str3);
		
		String str4 = str1.concat(str2);
		System.out.println(str4);
		
		//Length
		
		System.out.println(str1.length());
		
		String str5 = "      HIHHfldjflajdf   KHKUlfjljdfdj    jfdljfl     ";
		System.out.println(str5);
		System.out.println(str5.trim());
		
		//Uppercase
		
		System.out.println(str5.toUpperCase());
		System.out.println(str5.toLowerCase());
		
		System.out.println(str5.isEmpty());
		
		
		
	}

}

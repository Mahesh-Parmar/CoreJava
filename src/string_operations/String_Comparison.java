package string_operations;

public class String_Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Equals
		 * Compare To
		 * Matches
		 */
		
		//Equals
		String str1 = "ABCD";
		String str2 = "ABCd";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		if (str1.equals(str2)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
		
		
		//Compare To
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		
		//Matches
		String patt = "[A-Z]{1,}";
		
		System.out.println(str1.matches(patt));
	}

}

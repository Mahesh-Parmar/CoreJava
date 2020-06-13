package whats_new_in_java10;

public class Garbage_Collector {

	public static void main(String[] args) {
		
		String str1 = "AE2LSDFL6D;F;LD";
		
		for (int i = 0; i < str1.length()-1; i++) {
			String temp = "cg"+i+"!"+str1.charAt(i);
		}

	}

}

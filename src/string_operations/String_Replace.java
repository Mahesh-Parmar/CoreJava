package string_operations;

public class String_Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Replace - Normal
		 * Replace - RegEx
		 */
		
		//Replace - Normal
		String str1 = "CONCENTRAT1234ON 1234MPROVES W1234TH PRACT1234CE";
		String str2 = "1234";
		String str3 = "I";
		
		System.out.println(str1.replace(str2, str3));
		
		String str4 = "EIT@#HER YOU CONTR(*^%$OL YOUR MIND )(O&R IT WI*&^LL ##CONT#^&ROL @YO%$U";
		String patt = "[^A-Za-z0-9\\s]";
		
		//Replace - RegEx
		System.out.println(str4.replaceAll(patt, ""));
	}

}

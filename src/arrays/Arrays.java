package arrays;

public class Arrays {

	public static void main(String[] args) {
		
		String [] DaysOfWeek = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		System.out.println(DaysOfWeek.length);
		
		System.out.println(DaysOfWeek[2]);
		
		DaysOfWeek[2] ="RRR";
		
		System.out.println(DaysOfWeek[2]);
		
		for (int i = 0; i < DaysOfWeek.length; i++) {
			System.out.println(DaysOfWeek[i]);
		}
	}

}

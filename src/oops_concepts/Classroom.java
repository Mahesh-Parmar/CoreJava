package oops_concepts;

public class Classroom {
	/**
	 * Data Encapsulation also called as Data Hiding
	 * Hiding the member variables of a class from other classes  
	 */
	
	private String sub1;
	private int stdCount1;
	
	public String getsub() {
		return sub1;
	}
	public void setsub(String sub) {
		this.sub1 = sub;
	}
	public int getstdCount() {
		return stdCount1;
	}
	public void setstdCount(int stdCount) {
		this.stdCount1 = stdCount;
	}
	
	public void displayDetails() {
		System.out.println("This is a "+ sub1 +" classroom and it has "+ stdCount1 + " students.");
	}
}

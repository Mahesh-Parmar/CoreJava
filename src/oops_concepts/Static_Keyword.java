package oops_concepts;

public class Static_Keyword {
	/**
	 * Static Keyword
	 * Static Members Belong to Class (Type) and not ot Object
	 */
	static String name = "ABC";
	byte age = 6;
	String grade = "1st";
	
	public void displayDetails() {
		System.out.println("Student " + name + " is " + age + " years oand and in " + grade + " grade");
	}
	
}

package oops_concepts;

public class Method_Overloading {
	/**
	 * Method Overloading
	 * Data Types
	 * Number of Args
	 * Order
	 */
	
	public void addition(int n1,int n2) {
		System.out.println(n1+n2);
	}
	
	public void addition(double n1,double n2) {
		System.out.println(n1+n2);
	}
	
	public void addition(int n1, double n2) {
		System.out.println(n1+n2);
	}
	
	public void addition(double n1,int n2) {
		System.out.println(n1+n2);
	}
	
	public void addition(int n1, int n2,int n3) {
		System.out.println(n1+n2+n3);
	}
}

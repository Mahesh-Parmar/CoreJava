package oops_concepts;

public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.empName= "Mahesh";
		e1.empId = 200;
		e1.empSalary = 12345;
		
		e1.displayEmployeeBonus();
		
		e2.empName = "Magan";
		e2.empId = 100;
		e2.empSalary = 10000;
		
		e2.displayEmployeeBonus();
	}

}

package ders1_homework;

public class CustomerInheritanceTest {

	public static void main(String[] args) {
		CustomerInheritance customer = new CustomerInheritance();
		EmployeeInheritance employee = new EmployeeInheritance();
		
		CustomerManagerInheritance customerManagerInheritance = new CustomerManagerInheritance();
		EmployeeManagerInheritance employeeManagerInheritance = new EmployeeManagerInheritance();
		
		customerManagerInheritance.Add();
		employeeManagerInheritance.BestEmployee();
		employeeManagerInheritance.List();
	}

}

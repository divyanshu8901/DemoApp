package in.ineuron.bean;

import in.ineuron.bean.*;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account("99565","Div","saving");
		
		Employee employee = new Employee("1234","rajkumar","55abc",account);
		
		employee.employeeDetails();
		
		

	}

}

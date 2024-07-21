package in.ineuron.bean;

public class Employee {

	private  String eid;
	private  String ename;
	private  String eaddr;
	
	//HAS-A relationship
	Account account;
	
	//Costructor injection
	public Employee(String eid, String ename, String eaddr,Account account) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddr = eaddr;
		this.account = account;
	}
	
	public void employeeDetails()
	{
		System.out.println("Employee details are ::");
		
		System.out.println("Employee id is : "+eid);
		System.out.println("Employee name is : "+ename);
		System.out.println("Employee address is : "+eaddr);
		System.out.println("===============================================");
		
		System.out.println("Account details are ::");
		
		System.out.println("Accoint no is : "+account.accNo);
		System.out.println("Account name is : "+account.accName);
		System.out.println("Account type is : "+account.accType);
		
		
		
	}
	
	
}

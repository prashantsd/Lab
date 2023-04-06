package lab;

abstract class Employee
{
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	static double specialAllowance = 250.80;
	static double hra = 1000.50;
	double salary;
	double transportAllowance;
	
	public Employee(long id,String name,String address,long phone)
	{
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	
	public void calculateSalary()
	{
		salary = basicSalary +(basicSalary*specialAllowance/100)+(basicSalary*hra/100);
		System.out.println(employeeName);
		System.out.println("Salary : "+salary);
	}
	
//	 abstract public void calculateTransportAllowance(); // abstract method for calculate the transportallowance
	
	public void calculateTransportAllowance() { // 
		transportAllowance = 10*basicSalary/100;
		System.out.println("Transport Allowance Salary for Trainee : "+transportAllowance);
}
}

class Manager extends Employee
{
	double transportAllowance;
	public Manager(long id,String name,String address,long phone,double salary)
	{
		super(id,name,address,phone);
		this.basicSalary = salary;
	}
	
	@Override
	public void calculateTransportAllowance() {
		transportAllowance = 15*basicSalary/100;
		System.out.println("Transport Allowance Salary for Manager : "+transportAllowance);	
	}
}

class Trainee extends Employee
{
	double transportAllowance;
	public Trainee(long id,String name,String address,long phone,double salary)
	{
		super(id,name,address,phone);
		this.basicSalary = salary;
	}
	
	
}


public class InheritanceActivity {

	public static void main(String[] args) {
	
		Manager m = new Manager(126534,"Peter","Chennai India",237844, 65000); // Manager object
		m.calculateSalary();
		m.calculateTransportAllowance();
		
		System.out.println("---------------------------------------------------");
		Trainee t = new Trainee(29846,"Jack","Mumbai India",442085, 45000); // Trainee Object
		t.calculateSalary();
		t.calculateTransportAllowance();
	}

}

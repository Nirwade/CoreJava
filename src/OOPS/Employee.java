package OOPS;

public class Employee {
	String Name;
	int Salary;
//String Company;//
	static String ChangeCompanyName;
	
	//1 single memory will be allocated to store//
	//always access static members via class name//
	
	public Employee(String Name,int Salary, String Company) {
		this.Name= Name;
		this.Salary = Salary;
		//this.Company = Company;//	
	}
		
		public Employee(String Name,int Salary) {
			this.Name= Name;
			this.Salary = Salary;
			// we can create multiple constructor in a same class//
		
		/* this.Name= p3;
		this.Salary = p2;
		this.Company = p1;	we can write in this way as well,*/
		//it is a good practice to use this keyword when defining constructor//
	}
		
	public static void ChangeCompanyName() {
		Employee.ChangeCompanyName="Accenture";
	}
	public void Printname(){
		
	System.out.println("The name of employee..." + Name);
	System.out.println("The Company of employee..." + Employee.ChangeCompanyName);
	System.out.println("The Salary of employee..." + Salary);
	
	
	

	}
	
}

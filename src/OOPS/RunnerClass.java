package OOPS;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Employee emp1 = new Employee();
		emp1.Name = "Anand";
		emp1.Salary =70000;
		emp1.Company= "Tata";
		
		Employee emp2 = new Employee();
		emp2.Name= "Himanshu";
		emp2.Salary =750000;
		emp2.Company ="Brila"; */
		
		Employee emp1= new Employee("Anand",80000,"Tata");	
		Employee emp2= new Employee("Himanshu",950000,"Brila");	
		Employee emp3= new Employee("rahul",956000);
		Employee emp4= new Employee("mithun",956000);

		Employee.ChangeCompanyName();
		//this static value will be impacted to all the given salary attributes//
		//Always access static members via class name//


emp2.Printname();	
emp1.Printname();
emp3.Printname();
emp4.Printname();

ChildClass child = new ChildClass();
Person per1 = new ChildClass();
ChildClass child1 = new ChildClass( "Rahul", 29, 1234, "Singer") {
};
child1.display();
	child1.print();
	per1.display();
	child.display();
	
	MethodOverloadingExample mr1 = new MethodOverloadingExample ();
	mr1.sum(3,  5);
	mr1.sum(4, 5, 6);
	
ICICBank ICI = new ICICBank	();
ICI.welcome();
ICI.withdraw();
EncapusulationExample E1 = new EncapusulationExample ();
E1.setName("Accenture");
System.out.println(E1.getName());

	
System.out.println("The age is " + child1.age);
	}
	
	
}
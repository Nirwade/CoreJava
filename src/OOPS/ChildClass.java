package OOPS;

public class ChildClass extends Person{
	
	String Profession;
	
public ChildClass() {
	
	System.out.println("Child class default constructor");
	
}
public ChildClass(String name,int age, int Id, String profession) {
	super(name,age);
	this.Profession = profession;
}

	public void print() {
		System.out.println("This is child class");
	}
	
		public void display() {
			System.out.println("This is from parent one, overriding");
				
}
	
		
}


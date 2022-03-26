package OOPS;

public class Person {

	public String name;
	public int age;
			
	public  Person() {
		System.out.println("Parent class default constructor");
		
	}
		
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
}
		public void display() {
			System.out.println("This is parent one");
			 
			 
	}
	
}
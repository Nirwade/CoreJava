package collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("John");
		list1.add("Sara");
		list1.add("delilah");
		list1.add(0,"Shash" );
		list1.add("delilah"); // here we can add multiple/similar values
		System.out.println("This is an LinkedList "+list1);
		
		list1.addFirst("Remo"); // this function adds the value at the beginning 
		System.out.println("adding the value at the beginning  "+list1);

		list1.addLast("Geeta");// this function add the value at the last
		System.out.println("adding the value at the last "+list1);
		
		list1.removeFirst(); // this function removes the first element from the list
		list1.removeLast();  // this function removes the last element from the list
		System.out.println("for removing 1st and last elements "+ list1);
		
		for (int index=0;index<list1.size();index++){
			
			System.out.println("This is an example of iterator " + list1.get(index)); // for loop is same for Arraylist and linkedlist
		}
	}
		
		

	}



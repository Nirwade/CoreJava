package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("Remo");// index 0
		array1.add("Priya"); // index 1
		array1.add("rohit"); // index 2
		array1.add("puja"); // index 3
		array1.add("jam"); // index 4
		
		array1.set(4, "sara"); //Used to replace the value of any particular index//
		                       // here 4 is the position pointer, on which index we want to replace the value//
		
		
		Collections.sort(array1);     // To sort Arraylist we use collection called class and using sort function and in that 
       System.out.println("To print all values using collections  " + array1);  // we are giving the value; it sorting the array in accenting order
		
       Collections.reverse(array1); // it is sorting the array in descending order
       System.out.println("printing all the values using collections revrse order " +array1); 
       
		System.out.println("The size of an array1 is " +array1.size());
        System.out.println("To remove " +array1.remove(0) );
        System.out.println("To print all values " + array1);
		System.out.println("Now the size of an array1 is " +array1.size());
		System.out.println("The exact element which present at 4th index is "+array1.get(3));
		
		for(int index=0;index<array1.size();index++){

	System.out.println("Using for loop, the sequential output is "+array1.get(index));
	// To print all the values of index here we are using get(index)//
	//easiest way to iterate all the elements using for loop//

	for (String name:array1) {
System.out.println("listing out all the elements in arraylist using name " +name);

//here we are simply creating a variable called name and this name will iterate all the values which are present inside array1
//here name will carry the value inside each and every value present inside array1
//name will iterate thought 1st elements 2nd, 3rd and so on and complete the entire loop using for each loop//

Iterator<String> itr = array1.iterator();

while (itr.hasNext()) {
System.out.println("print"+ itr.next());

//iterator works as elevator where it allows us to go from one element to another element//
//hasNext is a method

ListIterator<String> itr1 =array1.listIterator();

while(itr1.hasPrevious()) {
	System.out.println("list iterator example " + itr1.next());
	
	//It supports bi-directional traversal. i.e both forward and backward direction//
	//It supports all the four CRUD operations(Create, Read, Update, Delete) operations//

	

}
}
	}}
}
}
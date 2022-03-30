package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet follow the random order, i.e; prints the elements in random order
		//adding null values is allowed only in case of hashset and linked set
		
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("Nemo");
		set1.add("arthi");
		set1.add("riya");
		set1.add("jash");
		set1.add("shash");
        set1.add(null);
		set1.clone();

		System.out.println("This is hastset "+set1);


       
        
        
            
		System.out.println("This is clone of output elements  "+set1.clone()); // it makes the copy of output elements and prints again
		set1.remove("Nemo"); // it removes the specified elements from the set
		System.out.println("This is hastset "+set1);
		
		
		
		
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		
		//LinkedHashSet does not follow the random order, i.e; prints the elements as per the given inputs
		
		set2.add("bread");
		set2.add("butter");
		set2.add("bed");
		set2.add("veggies");
		set2.add("house");
        set2.add(null);

		System.out.println("This is linkedHashSet "+set2);
		
		
		
		
		TreeSet<String> set3 =new TreeSet<String>();
		set3.add("Apple");
		set3.add("mango");
		set3.add("Grape");
		set3.add("Banana");
		set3.add("Dragan fruit");
        set3.add(null); // Tree set does not allow adding null values 
        set3.pollFirst(); // removes first element
        set3.pollLast(); // removes last element


		
		System.out.println("This is TreeSet "+set3);

		

		



	}

}

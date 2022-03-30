package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> mp1 = new HashMap<Integer,String>();
		
		mp1.put(1, "Remo"); 
		mp1.put(2, "Hena");
		mp1.put(3, "rohit");
		mp1.put(4, "sema");
		mp1.put(5, "Remo");
		mp1.put(6, "prem");
		mp1.put(6, "seeta");
		 


		
		System.out.println("Map example >> "+mp1);
		//The output will be printed in the order which the data is inserted//
		// does not allow duplication in terms of key i.e; the key should always be unique//
		//it only allows duplication values//
		
		mp1.remove(6); // it removes the data
		System.out.println("Map example 1 >> "+mp1);
		
		mp1.replace(4, "ram"); // this function is used to replace the value
		mp1.put(6, "lakshman"); // alternate way to update the value
		
		
		
		
		
		System.out.println("Map example >> "+mp1);
		
		
		for(Map.Entry<Integer,String> entry1:mp1.entrySet()) {
			
			System.out.println(entry1.getKey());        // To iterate though the entire map we use this for loop method//
			System.out.println(entry1.getValue()); 
		}
		
		for(Integer var1:mp1.keySet()) {
			System.out.println("with only keys >>  " +var1);  // To iterate though only with keys we use this operation//
			System.out.println("Along with values >> " +mp1.get(var1)); // Now to get values along with keys we use this function
		}	
		
		for(String var2: mp1.values()) {
			
			System.out.println("With only values >> "+var2); // To iterate through only value we use this operation
			System.out.println("with keys"+mp1.keySet());
		}	
//======================================================================================================
		
		
LinkedHashMap<Integer,String> mp2 = new LinkedHashMap<Integer,String>();
		//Linkedhashmap maintains the output order in which the data is inserted w.r.t to keys and values
		mp2.put(4, "munar");
		mp2.put(2, "kerala");
		mp2.put(3, "simla");
		mp2.put(1, "manali");
		mp2.put(5, "keerganaga");
		mp2.put(7, "kasol");
		mp2.put(6, "korag");
	
		System.out.println("To get values w.r.t keys  >>   " +mp2.get(5));
		// this function prints the values with respect to keys//

		
		System.out.println("This is linkedhashmap"+mp2);
		
//=========================================================================================================
		
TreeMap<Integer,String> mp3 = new TreeMap<Integer,String>();
// Treemap maintains both the key and values in ascending order//
		
		mp3.put(1, "Chat");
		mp3.put(3, "Panipuri");
		mp3.put(2, "Pav");
		mp3.put(4, "Vada Pav");
		mp3.put(7, "Masala puri");
		mp3.put(6, "papdi");
		mp3.put(5, "dahi vada");
		
				
		System.out.println("This is Treemap"+mp3);

	}

}

package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		
		pq1.add("John");
		pq1.add("Pal");
		pq1.add("sachin");
		pq1.add("puja");
		
		System.out.println("this is an example of "+pq1);
		System.out.println("This is an example of peek... "+ pq1.peek()); //prints the head element
		System.out.println("this is an example of poll.."+pq1.poll());   // removes the first element
		System.out.println("this is an example of "+pq1);
		System.out.println("this is an example of poll.."+pq1.size());  // prints no of elements in queue
		
		ArrayDeque<String> ad1 = new ArrayDeque<String>();
		ad1.add("John");
		ad1.add("Pal");
		ad1.add("sachin");
		ad1.add("puja");
		ad1.add("sam");
		System.out.println("this is an example of "+ad1);
		System.out.println("This is an example of peek... "+ ad1.peek());
		System.out.println("This is an example of peek first... "+ ad1.peekFirst()); //prints the 1st element
		System.out.println("This is an example of peek last... "+ ad1.peekLast()); // prints the last element
		
		System.out.println("This is an example of poll... "+ ad1.poll()); // removes the head element
		System.out.println("This is an example of poll first... "+ ad1.pollFirst()); // removes the 1st element
		System.out.println("This is an example of poll last... "+ ad1.pollLast()); // removes the last element
		
		System.out.println("this is an example of "+ad1);




		
		


		

	}

}

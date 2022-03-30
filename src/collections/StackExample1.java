package collections;

import java.util.Stack;

public class StackExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack follows (LIFO) Last In First Out method
 
		Stack<Integer> stack1 = new Stack<Integer>();
		
		stack1.push(5);
		stack1.push(9);
		stack1.push(2);
		stack1.push(11);
		stack1.push(7);   // here we are using push function to add values to stack
		
		stack1.pop(); // the pop function we remove the last element which was added by default
		              // we do not have to specify the index value
		
		stack1.peek();
		System.out.println("this is peek  "+stack1.peek()); // prints the element which is at the top of the stack
		
		stack1.search(1);
		System.out.println(stack1.search(1));
		
		stack1.empty(); // returns the value as true if the stack is empty otherwise false
		System.out.println("Returns the true/false boolean value if stack is empty .." +stack1.empty());
		
		
		System.out.println("This is an example of stack  "+stack1);
	}

}

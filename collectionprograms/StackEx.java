package collectionprograms;

import java.util.Stack;

/* Kavya Bai Mahendrakar*/

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		stack.push("Guava");
		stack.push("Mango");
		stack.push("Apple");
		stack.push("Orange");
		stack.push("Mango");
		stack.push("Banana");
		stack.push(null);
		stack.push("PineApple");
		
		System.out.println("Stack Elements: "+stack);
		System.out.println("Removing Element: "+stack.pop());
		System.out.println("Stack Elements: "+stack);
		System.out.println("Search Element: "+stack.search("Banana"));
		System.out.println("Search Element: "+stack.search("Watermelon"));
		

	}

}

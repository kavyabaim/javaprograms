package collectionprograms;

import java.util.ArrayDeque;
import java.util.Deque;

/* Kavya Bai Mahendrakar*/

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> arrayDeque = new ArrayDeque<String>();
		arrayDeque.add("Cofee");
		arrayDeque.offer("Tea");
		arrayDeque.offerFirst("Ice-Cream");
		arrayDeque.offerLast("Pizza");
		arrayDeque.offer("Burger");
		
		System.out.println("Deque: "+arrayDeque);
		
		System.out.println("Removing 1st Element: "+arrayDeque.pollFirst());
		
		System.out.println("Deque After removing Element: "+arrayDeque);

		System.out.println("Removing last Element: "+arrayDeque.pollLast());
		
		System.out.println("Deque After removing Element: "+arrayDeque);

	}

}

package collectionprograms;

import java.util.PriorityQueue;
import java.util.Queue;

/* Kavya Bai Mahendrakar*/

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("Jasmine");
		queue.offer("Lilly");
		queue.offer("Lotus");
		queue.offer("Mogra");
		queue.offer("Rose");
		
		System.out.println("Queue: "+queue);
		
		System.out.println("Head of Queue: "+queue.element());
		
		System.out.println("Removing Element: "+queue.remove());
		
		System.out.println("Queue After removing Element: "+queue);

		System.out.println("Removing Element: "+queue.poll());
		
		System.out.println("Queue After removing Element: "+queue);

	}

}

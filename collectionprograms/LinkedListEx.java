package collectionprograms;

import java.util.LinkedList;

/* Kavya Bai Mahendrakar*/

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Apple");
		linkedList.add("Grapes");
		linkedList.add("Apple");
		linkedList.add(1,"Banana");
		linkedList.add("Mango");
		linkedList.add(null);
		linkedList.add("Orange");
		for(String string:linkedList) {
			System.out.println(string);
		}
		
		LinkedList<String> linkedList2 = new LinkedList<String>();
		linkedList2.add("Jasmine");
		linkedList2.add("Lilly");
		linkedList.addAll(linkedList2);
		System.out.println("After Adding Elements of linkedList2 to linkedList: "+linkedList);

	}

}

package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* Kavya Bai Mahendrakar*/

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("kavya");
		list.add(101);
		list.add(20.56);
		list.add(true);
		list.add(null);
		list.add("kavya");
		System.out.println("List Elements: "+list);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("kavya");
		list2.add("Hari");
		list2.add("Krishna");
		list2.add("Ramya");
		//list2.add(null);
		list2.add("kavya");
		System.out.println("Generic List Elements: "+list2);
		
		System.out.println("Iterating List using Iterator Interface: ");
		Iterator<String> iterator = list2.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Iterating List using For-each: ");
		for(String string:list2) {
			System.out.println(string);
		}
		
		Collections.sort(list2);
		System.out.println("After Sorting: ");
		for(String string:list2) {
			System.out.println(string);
		}

	}

}

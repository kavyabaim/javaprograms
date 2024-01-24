package collectionprograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/* Kavya Bai Mahendrakar*/

public class SetPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("A");
		hashSet.add(null);
		hashSet.add("C");
		
		System.out.println("Implementing HashSet:");
		for(String string:hashSet) {
			System.out.println(string);
		}
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("A");
		linkedHashSet.add("C");
		linkedHashSet.add(null);
		System.out.println("\nImplementing LinkedHashSet: \n"+linkedHashSet);
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("A");
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("A");
		System.out.println("\nImplementing TreeSet: \n"+treeSet);
		
		

	}

}

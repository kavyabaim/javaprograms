package collectionprograms;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

/* Kavya Bai Mahendrakar*/

public class MapImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("In", "India");
		map.put("Br", "Brazil");
		map.put("De", "Germany");
		map.put("Fr", "France");
		map.put(null, null);
		
		System.out.println("Implementing HashMap: ");
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Contry Code: "+entry.getKey()+", Country: "+entry.getValue());
		}
		
		Map<String, String> treemap = new TreeMap<String, String>();
		treemap.put("BR102", "Cofee");
		treemap.put("L102", "Chole-Puri");
		treemap.put("D302", "Pasta");
		treemap.put("BR105", "Tea");
		treemap.put("L213", "Biryani");
		//treemap.put(null, null);
		
		System.out.println("\nImplementing TreeMap: ");
		for(Map.Entry<String, String> entry : treemap.entrySet()) {
			System.out.println("Code: "+entry.getKey()+", Menu: "+entry.getValue());
		}
		
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
		hashTable.put("BR102", "Cofee");
		hashTable.put("L102", "Chole-Puri");
		hashTable.put("D302", "Pasta");
		hashTable.put("BR105", "Tea");
		hashTable.put("L213", "Biryani");
		//hashTable.put(null, null);
		
		System.out.println("\nImplementing HashTable: ");
		for(Map.Entry<String, String> entry : hashTable.entrySet()) {
			System.out.println("Code: "+entry.getKey()+", Menu: "+entry.getValue());
		}
		

	}

}

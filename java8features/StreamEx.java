package java8features;

import java.util.ArrayList;
import java.util.List;

/*Kavya Bai Mahendrakar*/

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Rishika");
		list.add("Bhanu");
		list.add("Ramya");
		list.add("GeethaSri");
		list.add("siri");
		list.add("Manju");
		list.add("Radhasri");
		
		int count=0;
		
		for (String string : list) {
			if(string.length()<6) {
				count++;
			}
		}
		System.out.println("There are "+count+" Names whose length is less than 6");
		
		long count1 = list.stream().filter(str->str.length()<6).count();
		
		System.out.println("There are "+count1+" Names whose length is less than 6");

	}

}

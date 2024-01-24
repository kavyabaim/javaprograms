package practiceproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Kavya Bai Mahendrakar*/

public class StreamApi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Seetha");
		list.add("Geetha");
		list.add("Sruthi");
		list.add("Ramya");
		list.add("Swetha");
		list.add("Anitha");
		
		List<String> resultList = list.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		//List<String> resultList = list.stream().filter(s -> s.toLowerCase().startsWith("s")).collect(Collectors.toList());
		System.out.println(resultList);

	}

}

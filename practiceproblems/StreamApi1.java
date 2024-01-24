package practiceproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Kavya Bai Mahendrakar*/

public class StreamApi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(28);
		list.add(26);
		list.add(23);
		list.add(24);
		list.add(25);
		list.add(30);
		
		List<Integer> resultList = list.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(resultList);

	}

}

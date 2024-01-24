package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Kavya Bai Mahendrakar*/

public class StreamWithMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(56);
		marks.add(76);
		marks.add(54);
		marks.add(80);
		marks.add(76);
		marks.add(83);
		System.out.println("Marks before Grace: "+marks);
		
		List<Integer> updatedMarks = marks.stream().map(i->i+10).collect(Collectors.toList());
		
		System.out.println("Marks after Grace: "+updatedMarks);

	}

}

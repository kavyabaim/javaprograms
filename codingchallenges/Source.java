package codingchallenges;

import java.util.Scanner;
import java.util.stream.Collectors;

/*Kavya Bai Mahendrakar*/

@FunctionalInterface
interface Space{
	String insertSpace(String str);
}

class InsertSpace implements Space{

	public String insertSpace(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}
		return "";
	}

	
}

public class Source {
	
	public String insertSpace(String s) {
		return s.chars()						//converting into characters
				.mapToObj(ch -> (char)ch+" ")   // adding space for each char
				.collect(Collectors.joining()); //joining characters
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Space s1 = (str) -> {
			for(int i=0;i<str.length();i++) {
				System.out.print(str.charAt(i)+" ");
			}
			return "";
		};
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.println("Using Lambda Expression: ");
		System.out.println(s1.insertSpace(str1));
		
		InsertSpace is = new InsertSpace();
		System.out.println("Without Using Lambda Expression: ");
		System.out.println(is.insertSpace(str1));
		
		Source s2 = new Source();
		System.out.println("Using Lambda Expression & Stream Api: ");
		String result = s1.insertSpace(str1);
		System.out.println(result);

	}

}

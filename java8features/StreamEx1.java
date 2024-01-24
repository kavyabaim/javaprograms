package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Kavya Bai Mahendrakar*/

public class StreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Raj","Rani","Teja","Suryasri","Revanthi","Kushika","seetha");
		
		//create stream
		Stream<String> allNames = names.stream();
		
		//perform intermediate operation
		Stream<String> longNames = allNames.filter(str -> str.length()>5);
		
		//perform terminal peration
		System.out.println("Using forEach() : ");
		longNames.forEach(str -> System.out.println(str));
		
		//single line
		//collect(Collectors.toList()) : used to convert stream into list
		List<String> namesCollect =  names.stream().filter(str -> str.length()>5).collect(Collectors.toList());
		System.out.println("\nUsing collect() : ");
		//namesCollect.forEach(str -> System.out.println(str));
		namesCollect.forEach(System.out::println);

	}

}

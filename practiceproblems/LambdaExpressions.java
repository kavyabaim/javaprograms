package practiceproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Kavya Bai Mahendrakar*/

@FunctionalInterface
interface Square{
	int square(int n);
}

@FunctionalInterface
interface Circle{
	float circle(float r);
}

@FunctionalInterface
interface SimpleInterest{
	float simpleInterest(float p, float n, float r);
}

@FunctionalInterface
interface Percentage{
	double percentage(double m1, double m2, double  m3);
}

class Employee{
	int id,age;
	String name;
	public Employee(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
}
public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1 = (n)->n*n;
		System.out.println("1. Square: "+s1.square(4));
		
		Circle c1 = (r)->3.14f*r*r;
		System.out.println("2. Circle: "+c1.circle(4));

		SimpleInterest si = (p,n,r)->p*n*r/100;
		System.out.println("3. SimpleInterest: "+si.simpleInterest(20000,4,10));
		
		Percentage p1 = (m1,m2,m3)-> (m1+m2+m3)/3;
		System.out.println("4. Percentage: "+p1.percentage(95,86,92));
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, 30, "Raju"));
		list.add(new Employee(102, 25, "Pooja"));
		list.add(new Employee(103, 32, "Ashwini"));
		list.add(new Employee(104, 28, "Sahithi"));
		list.add(new Employee(105, 33, "Bhanu"));
				
		Collections.sort(list, (e1,e2)-> e1.name.compareTo(e2.name));
		System.out.println("5. List after sorting:");
		list.forEach((e)->System.out.println(e));

	}

}

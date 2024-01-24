package practiceproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Kavya Bai Mahendrakar*/

class Employee1{
	int id,age,salary;
	String name;
	public Employee1(int id, int age, int salary, String name) {
		super();
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", age=" + age + ", salary=" + salary + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class StreamApi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee1> list = new ArrayList<Employee1>();
		list.add(new Employee1(101, 27, 28000, "Ramu"));
		list.add(new Employee1(102, 25, 40000, "Raji"));
		list.add(new Employee1(103, 23, 55000, "Shiva"));
		list.add(new Employee1(104, 25, 58000, "Anitha"));
		list.add(new Employee1(105, 26, 60000, "Balu"));
		list.add(new Employee1(106, 28, 24000, "Fathima"));
		
		System.out.println("Employee1 List: \n");
		for (Employee1 employee : list) {
			System.out.println(employee);
		}
		
		List<Employee1> result1 = list.stream().filter(e1 -> e1.salary >50000).collect(Collectors.toList());
		System.out.println("\nEmployee1 List whose salary is greater than 50000: \n");
		for (Employee1 employee : result1) {
			System.out.println(employee);
		}
		
		List<Employee1> result2 = list.stream().filter(e1 -> e1.salary < 30000).collect(Collectors.toList());
		System.out.println("\nEmployee1 List after adding bonus 5000 whose salary less than 30000: \n");
		for (Employee1 employee : result2) {
			employee.salary = employee.salary+5000;
			System.out.println(employee);
		}
		/*List<Integer> result3 = list.stream().filter(e1 -> e1.salary < 30000).map(e1 -> e1.getSalary()+5000).collect(Collectors.toList());
		System.out.println("\nEmployee1 List after adding bonus 5000 whose salary less than 30000: \n");
		for (Integer employee : result3) {
			System.out.println(employee);
		}*/
	}

}

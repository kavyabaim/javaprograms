package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* Kavya Bai Mahendrakar*/

class Employee{
	//Integer id, salary;
	int id, salary;
	String name;
	public Employee(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	
}
class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.salary==e2.salary) {
			return 0;
		}
		else if(e1.salary>e2.salary) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}

/*class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.salary.compareTo(e2.salary);
	}
	
}*/

class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.name.compareTo(e2.name);
	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, 23000, "Kavya"));
		list.add(new Employee(102, 24500, "Ramya"));
		list.add(new Employee(103, 25000, "Divya"));
		list.add(new Employee(104, 22500, "Riya"));
		list.add(new Employee(105, 21000, "Priya"));
		
		System.out.println("Sorting on the basis of salary:");
		Collections.sort(list, new SalaryComparator());
		for(Employee emp:list) {
			System.out.println(emp);
		}
		
		System.out.println("\nSorting on the basis of name:");
		Collections.sort(list, new NameComparator());
		for(Employee emp:list) {
			System.out.println(emp);
		}


	}

}

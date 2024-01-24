package filehandling;

import java.io.Serializable;

public class EmployeeDemo implements Serializable {
	int id;
	String name, designation;
	public EmployeeDemo() {
		super();
	}
	public EmployeeDemo(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Emloyee [id=" +id+", name="+name+", designation="+designation+ "]";
	}

}

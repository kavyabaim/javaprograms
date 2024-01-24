package classesandobjects;

public class Grade extends Student1
{
    String grade;
    
	public Grade() 
	{
		super();
	}
	
	public Grade(int id, String name, MyDate dob, float maths, float physics, float chemistry)
	{
		super(id,name,dob,maths,physics,chemistry);
	}
	
	public void calculate() {
		super.calculate();
		if(percentage>=90) {
			grade = "O";
		}
		else if(percentage>=80) {
			grade = "A+";
		}
		else if(percentage>=70) {
			grade = "A";
		}
		else if(percentage>=60) {
			grade = "B+";
		}
		else if(percentage>=50) {
			grade = "B";
		}
		else {
			grade = "F";
		}
	}
	
	public void display() 
	{
		super.display();
		System.out.println("Grade: "+grade);
	}
}

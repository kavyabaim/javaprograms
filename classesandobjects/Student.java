package classesandobjects;

public class Student 
{
	
    int rollNumber;
    String name;
    float maths, physics, chemistry, total, percentage;
    
    public Student() 
    {
    	rollNumber = 1;
        name = "Kavya";
        maths = 90;
        physics = 95;
        chemistry = 86;
    }
    
    public Student(int rollNumber, String name, float maths, float physics, float chemistry) 
    {
    	this.rollNumber = rollNumber;
    	this.name = name;
    	this.maths = maths;
    	this.physics = physics;
    	this.chemistry = chemistry;
    }
    
    public void calculate() 
    {
    	total = maths + physics + chemistry;
    	percentage = total/3;
    }
    
    public void display() 
    {
    	System.out.println("Roll Number: "+rollNumber);
    	System.out.println("Name of the Student: "+name);
    	System.out.println("Total Marks: "+total);
    	System.out.println("Percentage: "+percentage);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.calculate();
		student1.display();
		
		Student student2 = new Student(2, "Mani", 87, 98, 64);
		student2.calculate();
		student2.display();
  
	}

}

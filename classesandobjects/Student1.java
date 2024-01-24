package classesandobjects;

public class Student1 extends Person {
float maths, physics, chemistry, total, percentage;
    
    public Student1() 
    {
    	super();
        maths = 90;
        physics = 95;
        chemistry = 86;
    }
    
    public Student1(int id, String name, MyDate dob, float maths, float physics, float chemistry) 
    {
    	super(id,name,dob);
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
    	super.display();
    	System.out.println("Total Marks: "+total);
    	System.out.println("Percentage: "+percentage);
    }

}

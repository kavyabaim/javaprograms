package classesandobjects;

public class Arithmetic 
{
    float number1, number2;
    
    public Arithmetic() 
    {
    	number1 = 10;
    	number2 = 20;
    }
    public Arithmetic(float number1, float number2) 
    {
    	this.number1 = number1;
    	this.number2 = number2;
    }
    public void add() 
    {
    	System.out.println("Addition: " + (number1 + number2));
    }
    public void subtract() 
    {
    	System.out.println("Subtraction: " + (number1 - number2));
    }
    public void divide() 
    {
    	System.out.println("Division: " + (number1 / number2));
    }
    public void multiply() 
    {
    	System.out.println("Multiplition: " + (number1 * number2));
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Arithmetic number1 = new Arithmetic();
    number1.add();
    number1.subtract();
    number1.divide();
    number1.multiply();
    
    Arithmetic number2 = new Arithmetic(15,10);
    number2.add();
    number2.subtract();
    number2.divide();
    number2.multiply();
	}

}

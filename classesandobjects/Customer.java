package classesandobjects;

public class Customer extends Person
{
	String prodName;
	int quantity, price, billAmount;
	
	public Customer() 
	{
		super();
		prodName = "Book";
		quantity = 600;
		price = 50;	
	}
	public Customer(int id, String name, MyDate dob, String prodName, int quantity, int price  ) 
	{
		super(id,name,dob);
		this.prodName = prodName;
		this.quantity = quantity;
		this.price = price;
		
	}
	public void calculate() {
		billAmount = price*quantity;
	}
	public void display() {
		super.display();
		System.out.println("Name of the Product: "+prodName);
		System.out.println("Quantity: "+quantity);
		System.out.println("Price: "+price);
		System.out.println("Bill Amount: "+billAmount);
	}

}

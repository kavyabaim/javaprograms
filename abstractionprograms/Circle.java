package abstractionprograms;

public class Circle extends Drawable {

	public void area() {
		System.out.println("constructor inside overriden method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.area();
		c.print();

	}

}

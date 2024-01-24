package abstractionprograms;

public class InterfaceImplementation implements Addable, Printable {

	public static void main(String[] args) {
		InterfaceImplementation impl = new InterfaceImplementation();
		impl.print();
		Addable.add(23, 12);
		impl.Mul(2, 3);
		impl.div(20, 5);
		impl.Show();

	}

	public void print() {
		float r = 10;
		System.out.println("Area: " + (PI * r * r));
	}

	public void div(double a, double b) {

		System.out.println("Div: " + (a / b));
	}

	@Override
	public void Show() {
		// TODO Auto-generated method stub
		Printable.super.Show();
	}

}

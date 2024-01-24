package classesandobjects;

public class Discount extends Customer {
	float discount, totalBill;

	public Discount() {
		super();
	}

	public Discount(int id, String name, MyDate dob, String prodName, int quantity, int price) {
		super(id, name, dob, prodName, quantity, price);
	}

	public void calculate() {
		super.calculate();
		if (billAmount >= 20000) {
			discount = billAmount * 0.15f;
		} else if (billAmount >= 15000) {
			discount = billAmount * 0.1f;
		} else if (billAmount >= 10000) {
			discount = billAmount * 0.07f;
		} else {
			discount = 0;
		}
		totalBill = billAmount - discount;
	}

	public void display() {
		super.display();
		System.out.println("Discount : " + discount);
		System.out.println("Total Bill : " + totalBill);
	}
}

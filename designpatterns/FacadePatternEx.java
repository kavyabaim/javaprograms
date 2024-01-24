package designpatterns;

import java.util.Scanner;

/*Kavya Bai Mahendrakar*/

interface MobileShop{
	void modelnNo();
	void price();
}
class IPhone implements MobileShop{

	@Override
	public void modelnNo() {
		// TODO Auto-generated method stub
		System.out.println("Iphone6");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Rs.70000");
	}
	
}
class Samsung implements MobileShop{

	@Override
	public void modelnNo() {
		// TODO Auto-generated method stub
		System.out.println("Samsung Galaxy");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Rs.42000");
	}
	
}
class Blackberry implements MobileShop{

	@Override
	public void modelnNo() {
		// TODO Auto-generated method stub
		System.out.println("Blackberry z10");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Rs.57000");
	}
	
}
class Shopkeeper{
	private IPhone iphone;
	private Samsung samsung;
	private Blackberry blackberry;
	
	public Shopkeeper() {
		iphone = new IPhone();
		samsung = new Samsung();
		blackberry = new Blackberry();
	}
	
	public void saleIPhone() {
		iphone.modelnNo();
		iphone.price();
	}
	
	public void saleSamsung() {
		samsung.modelnNo();
		samsung.price();
	}
	
	public void saleBlackberry() {
		blackberry.modelnNo();
		blackberry.price();
	}
}
public class FacadePatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Shopkeeper shopKeeper = new Shopkeeper();
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("Enter your choice\n Press Enter\n1.IPhone\n2.Samsung\n3.Blackberry\n4.Exit");
			choice = sc.nextInt();
			switch(choice){
			case 1: shopKeeper.saleIPhone();
			break;
			case 2: shopKeeper.saleSamsung();
			break;
			case 3: shopKeeper.saleBlackberry();
			break;
			default: System.out.println("Invalid Choice");
			}
		}while(choice!=4);

	}

}

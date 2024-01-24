package abstractionprograms;

import java.util.Scanner;

abstract class Bank{
	public abstract float getRateOfInterest();
}

class BOI extends Bank{
	public float getRateOfInterest() {
		return 8.7f;
	}
}

class TJSB extends Bank{
	public float getRateOfInterest() {
		return 6.7f;
	}
}
public class BankAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float principleAmount, years, rateBOI, rateTJSB;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principle Amount: ");
		principleAmount = sc.nextFloat();
		
		System.out.println("Enter number of years: ");
		years = sc.nextFloat();
		
		Bank bBOI = new BOI();
		rateBOI = bBOI.getRateOfInterest();
		
		Bank bTJSB = new TJSB();
		rateTJSB = bTJSB.getRateOfInterest();
		
		float interestBOI = (principleAmount*years*rateBOI)/100;
		float interestTJSB = (principleAmount*years*rateTJSB)/100;
		
		System.out.println("Simple interest for BOI: "+interestBOI);
		System.out.println("Simple interest for TJSB: "+interestTJSB);

	}

}

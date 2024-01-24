package seriesprograms;

import java.util.Scanner;

public class series10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n;
		double fact;
		double sum=0.00;
		System.out.println("Enter Number");
		n = sc.nextInt();
		for(double i=1;i<=n;i++) {
			fact=1;
			for(double j=1;j<=i;j++) {
				fact = fact*j;
			}
			sum = sum+(i/fact);
			System.out.print((int)i+"/"+(int)i+"!");
			if(i<n) {
				System.out.print(" + ");
			}
			
		}
		System.out.print(" = "+sum);
	}

}

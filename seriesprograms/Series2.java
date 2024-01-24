package seriesprograms;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n;
		double sum=0.00;
		System.out.println("Enter Number");
		n = sc.nextInt();
		for(double i=1;i<=n;i++) {
			
			sum = sum+(1/i);
			System.out.print(1+"/"+(int)i);
			if(i<n) {
				System.out.print(" + ");
			}
			
		}
		System.out.print(" = "+sum);
			
		}

	}



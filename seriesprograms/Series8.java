package seriesprograms;

import java.util.Scanner;

public class Series8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n;
		int sum=0;
		System.out.println("Enter Number");
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			
			sum = sum+(i*(i+1));
			System.out.print(i+"*"+(i+1));
			if(i<n) {
				System.out.print(" + ");
			}
			
		}
		System.out.print(" = "+sum);


	}

}

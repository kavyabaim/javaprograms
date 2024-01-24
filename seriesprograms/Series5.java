package seriesprograms;

import java.util.Scanner;

public class Series5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter Number");
		n = sc.nextInt();
		for(int i = 1; i<=n;i=i+2) {
			System.out.print(i*i+" ");
			
		}

	}

}

/*
 * Q.1
Second Smallest:
Your task here is to implement a Java code based on the following specifications. Note that your code should match the specifications in a precise manner. Consider default visibility of classes, data fields and methods unless mentioned otherwise.

Specifications:
class definitions:
class Source:
visibility: public
method definitons:
getSecondSmallest(int []arr): accept an array of integer elements and return
the second smallest element in the arrayreturn type: int
visibility: public

Task
Create a Source class and implement below given method:
• getSecondSmallest(int []arr): accept an array of integer elements and return the second
smallest element in the array

Sample Input:
23, 45, 32, 22, 20, 96
Sample Output:
22
  */



package codingchallenges;

import java.util.Scanner;

import java.util.Arrays;

public class Example1 {
	
	public int getSecondSmallest(int[] arr) {
		
		Arrays.sort(arr);
		
		return arr[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Example1 ele = new Example1();
     
     int[] array = new int[6];
     
     Scanner sc = new Scanner(System.in);
     
     for(int i=0; i<6; i++) {
    	 array[i] = sc.nextInt();
     }
     
     int output = ele.getSecondSmallest(array);
     System.out.println(output);
	}

}

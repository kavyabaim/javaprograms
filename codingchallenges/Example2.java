/*
 * Q.2
Distance Traveled
Problem Statement:
Write a program to calculate the distance travelled by car at different time intervals. The initial velocity of the car is 36km/hr and the constant acceleration is 5 m/s2.
The formula to calculate distance is:
Distance Travelled = u*t+((a*t*t)/2) where,
u = initial velocity of the car (36 km/hr)
a = acceleration of the car (5 m/s )
t = time duration in seconds

The program should accept 2-time intervals as the input (one-time interval per line) and print the distance travelled in meters by car (one output per line).
Definitions:
1 kilometer = 1000 meters
1 hour = 3600 seconds
Sample Input
10
8
Sample Output
350
240
 * */


package codingchallenges;

/*Kavya Bai Mahendrakar*/
import java.util.Scanner;

public class Example2 {
	
	public void getDistance(int t) {
		int u=10;
		int a=5;
		int d =  u*t+((a*t*t)/2);
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Example2 ele = new Example2();
		ele.getDistance(a);
		ele.getDistance(b);
		
	}

}

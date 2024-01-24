/*
 * Q.3
Write a java program to validate the age of a person and display proper message by using user defined exception. 
Age of a person should be above 15.
Your task here is to implement a Java code based on the following specifications. Note that your
code should match the specifications in a precise manner. 
Consider default visibility of classes, data fields and methods unless mentioned otherwise.
Specifications:
class definitions:
class MyException: Define exception
class Source:
method definitons:
checkAge(int age): throw a user defined exception if age is smaller than 15
visibility: public
Task
• Define MyException class
• Create a class Source and implement the below given method
• String checkAge(int age): throw a user defined exception if age is smaller than 15
Sample Input
22
Sample Output
valid
 * */
 
package codingchallenges;

class MyException extends Exception {

	public MyException(String message) {
		super(message);
	
	}

	
	
}

public class AgeValidation {
	
	public static void checkAge(int age) throws MyException
	{
		if(age>=15) {
			System.out.println("Valid");
		}else {
			throw new MyException("Invalid");
		}
	}

	public static void main(String[] args) {
		
		try {
			checkAge(22);
		}catch (MyException e) {
			
			e.printStackTrace();
		}
		
	}

}

package codingchallenges;

import java.util.Scanner;

/*
 * Q.
Your task here is to implement a Java code based on the following specifications. 
Note that your code should match the specifications in a precise manner.
Consider default visibility of classes, data fields and methods unless mentioned otherwise.
Specifications:
class definitions:class Source:
visibility: public
method definition:
validate(String username, String password): method to authenticate username and password(Use custom values for username and password for authentication)
return type: boolean

Task
Create a Source class and implement below given method:
• validate(String username, String password): Use lambda expression to authenticate
username and password(Use custom values "ABC" for username and "DEF" as password for
authentication). Return true if authentication is successful else return false.
Implement using Lambda expressions.

Sample Input:
Alexa coded123

Sample Output:
false
 * */
 
public class LambdaValidtion {
	@FunctionalInterface
	interface Validation{
		 boolean validate(String username, String password);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validation element = (user,password) -> {
			if(user.equals("ABC") && password.equals("DEF")) {
				return true;
			}
			else {
				return false;
			}
		};
		Scanner sc = new Scanner(System.in);
		String userName,userPassword;
		System.out.println("Enter UserName: ");
		userName = sc.nextLine();
		System.out.println("Enter Password: ");
		userPassword = sc.nextLine();
		System.out.println("-----------------Result--------------------");
		System.out.println(element.validate( userName, userPassword));
		//System.out.println(element.validate( "Alexa", "coded123"));
	}

}

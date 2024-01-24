package exceptionhandling;

public class ThrowExample {
	
	public static void checkAge(int age) {
		if(age>=18) {
			System.out.println("-----Age Eligible for Voting-----");
		}
		else {
			throw new ArithmeticException("-----Age Invalid for Voting-----");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
		checkAge(15);
		
        }catch(Exception e) {
        	e.printStackTrace();
        }
        System.out.println("-----Rest of code-----");
	}

}

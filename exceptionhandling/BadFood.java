package exceptionhandling;

public class BadFood {
	
	public static void checkFruit(String fruitName) throws BadFoodException
	{
		if(fruitName.equalsIgnoreCase("Mango")) {
			System.out.println("I Like "+fruitName);
		}else {
			throw new BadFoodException("I don't Like "+fruitName);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkFruit("Grapes");
		}catch (BadFoodException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Rest code------------");

	}

}

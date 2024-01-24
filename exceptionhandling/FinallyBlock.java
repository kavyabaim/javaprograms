package exceptionhandling;

public class FinallyBlock {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("case 1;  Where exception doesn't occur");
		try {
			int a=25/4;
			System.out.println("Div: "+a);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("case 1: finally block always execute");
		}
		System.out.println("case 1: rest code........");
		System.out.println("---------------------------------------------------\n");
		System.out.println("case 2: Exception Occurs");
		   try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		   finally {
			   System.out.println("case 2: Executed finally block");
		   }
		   System.out.println("case 2: rest code........");
		   System.out.println("---------------------------------------------------\n");
		   
		   System.out.println("case 3: where exception occurs but doesn,t handled");
		   try {
			   int a = 26/0;
			   System.out.println("Div: "+a);
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		   finally {
			   System.out.println("case 3: finally block always executes");
		   }
		   System.out.println("case 3: rest code........");
		   System.out.println("---------------------------------------------------\n");
		   
	}

}

package exceptionhandling;

public class MultiCatchEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int[10];
			 a[12] = 25/0;
			System.out.println(a);
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			int a[] = new int[10];
			 a[12] = 25/4 ;
			System.out.println(a);
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println(" code.......");

	}
}

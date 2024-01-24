package java8features;

/*Kavya Bai Mahendrakar*/

@FunctionalInterface
interface Addable{
	
	int add(int a, int b);
	
}

public class LambdaMultiPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable a1 = (x,y) -> x+y;
		System.out.println("Add: "+a1.add(22, 12));
		
		Addable a2 = (int a, int b) -> {
			return a+b;
		};
		System.out.println("Add: "+a2.add(20, 10));

	}

}

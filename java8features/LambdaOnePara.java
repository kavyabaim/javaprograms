package java8features;

/*Kavya Bai Mahendrakar*/

@FunctionalInterface
interface Sayable1{
	
	String sayHello(String name);
	
}
public class LambdaOnePara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sayable1 s1 = (name) -> {
			return "Hello "+name+"!";
			};
			System.out.println(s1.sayHello("Kavya"));

	}

}

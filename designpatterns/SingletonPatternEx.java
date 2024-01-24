package designpatterns;

/* Kavya Bai Mahendrakar*/

class SingleObject{
	
	//create an object
	private static SingleObject instance = new SingleObject();
	
	//create private constructor so that this class cannot be instantiate
	private SingleObject() {
		
	}
	
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void show() {
		System.out.println("Accessing method using single object");
	}
}
public class SingletonPatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we can't create object of SingleObject class because constructor is private
		SingleObject obj = SingleObject.getInstance();
		obj.show();

	}

}

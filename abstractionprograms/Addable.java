package abstractionprograms;

public interface Addable {
	float PI = 3.14f;
	
	void print();
	
	public static void add(int a, int b) {
		System.out.println("Add: "+(a+b));
	}
	
	default void Mul(int a, int b ) {
		System.out.println("Mul: "+(a*b));
	}
	
	default void Show() {
		System.out.println("Addable");
	}

}

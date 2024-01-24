package abstractionprograms;

public interface Printable {
	void div(double a, double b);
	default void Show() {
		System.out.println("Printable");
	}


}

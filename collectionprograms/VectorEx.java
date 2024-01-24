package collectionprograms;

import java.util.Enumeration;
import java.util.Vector;

/* Kavya Bai Mahendrakar*/


public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		vector.addElement("Jasmine");
		vector.addElement("Rose");
		vector.addElement("Lilly");
		vector.addElement("Mogra");
		vector.addElement("Rose");
		vector.addElement(null);
		
		Enumeration<String> e = vector.elements();		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}

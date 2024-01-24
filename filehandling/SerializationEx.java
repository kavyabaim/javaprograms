package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		EmployeeDemo employee = new EmployeeDemo(101, "Riya","Programmer");
		
		FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\edubridge\\ser.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(employee);
		objectOutputStream.flush();
		System.out.println("Converted emp obj into byte stream");
		

	}

}

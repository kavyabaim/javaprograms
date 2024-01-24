package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		ObjectInputStream objectInputStream = new ObjectInputStream( new FileInputStream("C:\\Users\\Lenovo\\Desktop\\edubridge\\ser.txt"));
		EmployeeDemo employee = (EmployeeDemo)objectInputStream.readObject();
		System.out.println(employee);
		objectInputStream.close();

	}

}

package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\edubridge\\abc.txt",true);
		String str = "Welcome to EduBridge";
		byte bArray[] = str.getBytes();
		outputStream.write(bArray);
		outputStream.close();
		System.out.println("File created");

	}

}

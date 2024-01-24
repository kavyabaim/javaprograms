package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream inputStream = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\edubridge\\abc.txt");
		int i;
		while((i=inputStream.read())!=-1) {
			System.out.print((char)i);
		}
		inputStream.close();

	}

}

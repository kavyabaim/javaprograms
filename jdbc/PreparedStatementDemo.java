package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/* Kavya Bai Mahendrakar */

public class PreparedStatementDemo {
	
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	
	public PreparedStatementDemo() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
		System.out.println("Connection is established");
	}
	
	public void insertRecord(int id, String name, String email, int age, String city) throws SQLException {
		preparedStatement = connection.prepareStatement("insert into person values(?,?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, email);
		preparedStatement.setInt(4, age);
		preparedStatement.setString(5, city);
		
		int n = preparedStatement.executeUpdate();
		System.out.println(n+"record is inserted");
	}
	
	public void searchByCity(String city) throws SQLException{
		preparedStatement = connection.prepareStatement("select * from person where city = ?");
		preparedStatement.setString(1, city);
		
		resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.print(resultSet.getInt(1)+"\t");
			System.out.print(resultSet.getString(2)+"\t");
			System.out.print(resultSet.getString(3)+"\t");
			System.out.print(resultSet.getInt(4)+"\t");
			System.out.print(resultSet.getString(5));
			System.out.println();
		}
	}
	public void updateRecord(String city, int id) throws SQLException {
		preparedStatement = connection.prepareStatement(" update person set city = ? where pid = ?");
		preparedStatement.setString(1, city);
		preparedStatement.setInt(2, id);
		
		int n = preparedStatement.executeUpdate();
		System.out.println(n+"record is updated");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		PreparedStatementDemo demo = new PreparedStatementDemo();
		int age,id,choice;
		String name,email,city;
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------------------------------------");
		System.out.println("Choices:\n1. Insert Record\n2. Search By City\n3. Update Record\n4. Delete Record");
		System.out.println("------------------------\nEnter Choice: ");
		choice = sc.nextInt();
		switch(choice) {
		case 1 : 
			demo.insertRecord(107, "Noor", "noor@gmail.com", 22, "Chennai");
			break;
		case 2 :
			System.out.println("Enter city: ");
			city = sc.next();
			System.out.println("Search By City : "+city);
			demo.searchByCity(city);
			break;
		case 3 :
			System.out.println("Enter ID: ");
			id = sc.nextInt();
			System.out.println("Enter city: ");
			city = sc.next();
			demo.updateRecord(city, id);
			break;
		default : 
			System.out.println("Invalid Choice");
		    break;
		}
		System.out.println("------------------------------------------------------------");
	}

}

package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	
	public static Connection conn;
	PreparedStatement stmt;
	ResultSet rs;
	
	public static void open() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		if(conn==null) {
			conn = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/nomebanco", "root", "senha");
		}
	}

}

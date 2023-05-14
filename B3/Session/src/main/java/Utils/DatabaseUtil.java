package Utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainingdb_new","root", "fastbit"); 
			return conn;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

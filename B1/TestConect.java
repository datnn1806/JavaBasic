package training;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConect {
public static void main(String[] args) {
	String sqlInsert = "INSERT INTO course VALUES(?, ?, ?, ?, ?)";
	String selectAll = "SELECT * FROM course";
	try {
		Connection con = DatabaseUtil.getConnection();
		
		//register course
		PreparedStatement stm = con.prepareStatement(sqlInsert);
		stm.setString(1, "6");
        stm.setString(2, "2");
        stm.setString(3, "A001");
        stm.setString(4, "Java 1");
        stm.setInt(5, 2);
        stm.execute();
      //select all course
      	stm = con.prepareStatement(selectAll);
      	ResultSet rs = stm.executeQuery();
      	while (rs.next()) {
      	System.out.println(rs.getString(1)+" - "+rs.getString(2)+" - "+rs.getString(3)+" - "+rs.getString(4)+" - "+rs.getInt(5));
      	}
      	stm.close();
        con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}

}
}

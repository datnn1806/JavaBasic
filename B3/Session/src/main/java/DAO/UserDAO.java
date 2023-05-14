package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DTO.UserDTO;
import Utils.DatabaseUtil;

public class UserDAO {
	public UserDTO checkLogin(String username , String password) {
		String sql ="select * from user where username = ? and password = ?";
		try {
			Connection conn = DatabaseUtil.getConnection();
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, username);
			stm.setString(2, password);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				Long id = rs.getLong(1);
				String name = rs.getString(2);
				String pass = rs.getString(3);
				
				UserDTO user = new UserDTO(id,username, password);
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return null;
	}
}

package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DTO.CourseDTO;
import DTO.UserDTO;
import Utils.DatabaseUtil;

public class CourseDAO {
	public List<CourseDTO> listCourse() {
		String sql ="select * from course";
		try {
			Connection conn = DatabaseUtil.getConnection();
			PreparedStatement stm = conn.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			List<CourseDTO> listCourse = new ArrayList<>();
			while (rs.next()) {
				Long course_id = rs.getLong(1);
				Long subject_id = rs.getLong(2);
				String course_code = rs.getString(3);
				String title = rs.getString(4);
				String number_of_credits = rs.getString(5);
				
				CourseDTO courseDto = new CourseDTO(course_id, subject_id, course_code, title, number_of_credits);
				listCourse.add(courseDto);
			}
			return listCourse;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}

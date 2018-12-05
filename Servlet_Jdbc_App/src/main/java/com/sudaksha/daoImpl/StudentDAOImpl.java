package com.sudaksha.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sudaksha.bean.Student;
import com.sudaksha.dao.StudentDAO;
import com.sudaksha.db.DBUtil;
import com.sudaksha.query.Query;

public class StudentDAOImpl implements StudentDAO {

	Connection con = null;
	PreparedStatement ps = null;
	public int insertStudent(Student student) {
		int n = 0;
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(Query.insert_student);
			ps.setInt(1, student.getStudentNumber());
			ps.setString(2, student.getStudentName());
			ps.setInt(3, student.getStudentMarks());
			n = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}

}

package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bean.Student;

public class StudentDataRowMapper  implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int arg1) throws SQLException {
		
		Student stud=new Student();
		stud.setId(rs.getInt(1));
		stud.setfName(rs.getString(2));
		stud.setlName(rs.getString(3));
		
		return stud;
	}

	
	

}

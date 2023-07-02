package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bean.Student;

public class StudentDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveStudent(Student stud) {
		String sql = "insert into studentdata values('" + stud.getId() + "','" + stud.getfName() + "','"
				+ stud.getlName() + "')";

		return jdbcTemplate.update(sql);
	}

	public Student getStudentByid(int id) {

		String sql = "select * from studentdata where id="+id;

		Student student = jdbcTemplate.queryForObject(sql,
				(RowMapper<Student>) new BeanPropertyRowMapper<Student>(Student.class));
		return student;

	}

	public int updateStudent(Student stud) {

		String sql = "update studentdata set fname='" + stud.getfName() + "',lname='" + stud.getlName() + "'where id="
				+ stud.getId() + "";

		return jdbcTemplate.update(sql);
	}

	public int deleteStudent(Student stud) {

		System.out.println(stud);
		String sql = "delete from studentdata where id=" + stud.getId();

		return jdbcTemplate.update(sql);
	}

	public List<Student> getAllStudent() {

		return jdbcTemplate.query("select * from studentdata", new StudentDataRowMapper());

	}

}

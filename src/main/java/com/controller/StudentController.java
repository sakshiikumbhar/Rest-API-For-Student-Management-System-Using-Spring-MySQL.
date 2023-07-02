
package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.Student;
import com.dao.StudentDAO;

@Controller
public class StudentController {
	@Autowired
	private StudentDAO dao;
	
	
	@RequestMapping("/form")
	public String openForm(Model model)
	{
		
		Student stud=new Student ();
		model.addAttribute("stud", stud);		
		return"Index";
		
	}
	
	@RequestMapping("/save")
	public String saveStudent(@RequestParam("id")int id,@RequestParam("fName")String fName,@RequestParam("lName")String lName)
	{
		Student stud=new Student();
		System.out.println(stud);
		stud.setId(id);
		stud.setfName(fName);
		stud.setlName(lName);
		
		dao.saveStudent(stud);
		return "redirect:/readdata";
		
	}
	
	@RequestMapping("/readdata")
	public String readData(Model model)
	{
		List<Student> list=dao.getAllStudent();
		model.addAttribute("list",list);
		return "read";
		
	}
	
	@RequestMapping("/update1")
	public String upadteStudent(@RequestParam("id")int id,@RequestParam("fname")String fname,@RequestParam("lname")String lname)
	{
		Student stud=new Student();
		stud.setId(id);
		stud.setfName(fname);
		stud.setlName(lname);
		dao.updateStudent(stud);
		return "redirect:/readdata";
		
	}
	@RequestMapping("/updateform")
	public String updateForm(@RequestParam("id") int id,Model model)
	{
	
		Student stud=dao.getStudentByid(id);
		model.addAttribute("stud", stud);
		return "update";
	}
	
	
	@RequestMapping("/delete")
	public String deletStudent(Student student,@RequestParam("id")int id)
	{
		Student stud=dao.getStudentByid(id);
		dao.deleteStudent(stud);
		return "redirect:/readdata";
	}
	
	
	
	@RequestMapping("/show")
	public String ShowStudent(@ModelAttribute("stud") Student student)
	{
		
		return "display";
	}

}

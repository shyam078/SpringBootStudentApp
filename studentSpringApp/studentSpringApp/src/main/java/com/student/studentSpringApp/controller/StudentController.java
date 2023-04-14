package com.student.studentSpringApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentSpringApp.dao.StudentDao;
import com.student.studentSpringApp.dto.Student;

@RestController
public class StudentController {

	@Autowired
	StudentDao dao;
	
	@PostMapping("/Students")
	public Student saveStudent(@RequestBody Student student)
	{
		return dao.saveStudent(student);
	}
	
	@GetMapping("/Students/{id}")
	public Student getStudentById(@PathVariable int id)
	{
		Optional<Student> op=dao.getStudentById(id);
		if(op.isEmpty())
		{
			return null;
		}
		else
		{
			return op.get();
		}
	}
	@GetMapping("/Students")
	public List<Student> getAllStudent()
	{
		return dao.getAllStudent();
	}
}

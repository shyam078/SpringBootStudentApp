package com.teacher.teacherSpringApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.teacher.teacherSpringApp.dao.TeacherDao;
import com.teacher.teacherSpringApp.dto.Teacher;

@RestController
public class TeacherController {

	@Autowired
	TeacherDao dao;
	
	@PostMapping("/teacher")
	public Teacher saveTeacher(@RequestBody Teacher teacher)
	{
		return dao.saveTeacher(teacher);
	}
}

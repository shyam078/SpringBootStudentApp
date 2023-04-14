package com.teacher.teacherSpringApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.teacher.teacherSpringApp.dto.Teacher;
import com.teacher.teacherSpringApp.repository.TeacherRepo;

@Repository
public class TeacherDao {

	@Autowired
	TeacherRepo repo;
	
	public Teacher saveTeacher(Teacher teacher)
	{
		return repo.save(teacher);
	}
}

package com.student.studentSpringApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.studentSpringApp.dto.Student;
import com.student.studentSpringApp.repository.StudentRepo;

@Repository  //it is used to indicate the mechanism to perform all the CRUD operations
public class StudentDao {

	@Autowired
	StudentRepo repo;
	
	public Student saveStudent(Student student)
	{
	return repo.save(student);
	}
	
	public Optional<Student> getStudentById(int id)
	{
		return repo.findById(id);
	}
	
	public List<Student> getAllStudent()
	{
		return repo.findAll();
	}
}

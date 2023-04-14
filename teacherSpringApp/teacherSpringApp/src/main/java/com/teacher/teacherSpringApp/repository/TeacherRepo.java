package com.teacher.teacherSpringApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teacher.teacherSpringApp.dto.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer>{

}

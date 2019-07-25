package com.kgisl.springAnno.service;

import java.util.List;

import com.kgisl.springAnno.entity.Student;


public interface StudentService {

	public List<Student> getAllStudents();

	public void saveStudentObj(Student studentObj);

	public Student getStudentObj(Integer theId);

	public void removeStudentObj(Integer theId);

}
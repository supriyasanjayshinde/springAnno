package com.kgisl.springAnno.service;

import java.util.List;



import com.kgisl.springAnno.entity.Student;
import com.kgisl.springAnno.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Transactional 
	public List<Student> getAllStudents()
    {
		return studentRepository.findAll();
	}

	@Transactional
	public void saveStudentObj(Student studentObj)
	{
		studentRepository.save(studentObj);
	}

	@Transactional
	public Student getStudentObj(Integer theId)
	{
		Student studentObj=(Student)studentRepository.getOne(theId);
		return studentObj;
	}

	@Transactional
	public void removeStudentObj(Integer theId)
	{
		Student studentRem=(Student)studentRepository.getOne(theId);
		 studentRepository.delete(studentRem);
	}
	
}
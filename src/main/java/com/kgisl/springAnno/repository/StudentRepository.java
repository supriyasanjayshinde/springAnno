package com.kgisl.springAnno.repository;

import com.kgisl.springAnno.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * StudentRepository
 */
public interface StudentRepository extends JpaRepository<Student,Integer>{

   

}
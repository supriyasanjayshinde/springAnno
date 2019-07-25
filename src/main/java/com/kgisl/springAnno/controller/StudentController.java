package com.kgisl.springAnno.controller;

import java.util.List;

import com.kgisl.springAnno.entity.Student;
import com.kgisl.springAnno.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

	
	@Autowired
	StudentService studentService;

	@RequestMapping("/saveProcess")
	public String saveStudentObj(@ModelAttribute("student") Student studentObj) {
		studentService.saveStudentObj(studentObj);
		return "redirect:/student/list";
	}
	
	@RequestMapping("/list")
	public String listOfStudents(Model model) {
		// ModelAndView mav=new ModelAndView("list-students");
		// mav.addObject("studentsList", studentService.getAllStudents());
		// return mav;
		List<Student> studentsList = studentService.getAllStudents();
		model.addAttribute("studentsList", studentsList);
		// model.addAttribute(studentsList);
		return "list-students";
	}

	@RequestMapping("/displayUpdateForm")
	public ModelAndView showUpdateForm(@RequestParam("studentId") int theId, Model model) {
		ModelAndView mav=new ModelAndView("student-form");
		mav.addObject("student",studentService.getStudentObj(theId));
		return mav;
	}
	

	@RequestMapping("/showFormForAdd")
	public String showAddForm(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}


	@RequestMapping("/displayDeleteForm")
	public String deleteStudentObj(@RequestParam("studentId") int theId, Model model) {
		studentService.removeStudentObj(theId);
		return "redirect:/student/list";
	}
}
/**
 * 
 */
package com.student.dashBoard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.dashBoard.entity.Student;
import com.student.dashBoard.service.StudentService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Sai Krishna
 *
 */
@RestController
@RequestMapping("/student")
@CrossOrigin
@Slf4j
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@PostMapping("/")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/{id}")
	public Student getStudentDetails(@PathVariable Integer id) {
		System.out.println(id);
		return studentService.getById(id);
	}
	
	
	

	
	
}

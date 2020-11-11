package com.example.springbootsimpleapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootsimpleapi.model.Student;
import com.example.springbootsimpleapi.service.StudentsService;

@RestController
public class StudentsController {
	
	
	@Autowired
	StudentsService studentsService;

	// creating a get mapping that retrieves all the students detail from the database
	@GetMapping("/student")
	private List<Student> getAllStudents() {
		return studentsService.getAllStudents();
	}

	// creating a get mapping that retrieves the detail of a specific students
	@GetMapping("/student/{id}")
	private Student getBooks(@PathVariable("id") int bookid) {
		return studentsService.getStudentById(bookid);
	}

	// creating a delete mapping that deletes a specified student
	@DeleteMapping("/student/{id}")
	private void deleteBook(@PathVariable("id") int bookid) {
		studentsService.delete(bookid);
	}

	// creating post mapping that post the book detail in the database
	@PostMapping("/student")
	private Student saveBook(@Valid @RequestBody Student student) {
		studentsService.save(student);
		return student;
	}
		

	// creating put mapping that updates the student detail
	@PutMapping("student")
	private Student update(@RequestBody Student student) {
		studentsService.update(student);
		return student;
	}

}

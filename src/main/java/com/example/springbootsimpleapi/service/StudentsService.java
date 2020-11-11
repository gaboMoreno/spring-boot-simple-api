package com.example.springbootsimpleapi.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import com.example.springbootsimpleapi.model.Student;
import com.example.springbootsimpleapi.repository.StudentsRepository;

@Service
public class StudentsService {
	@Autowired
	StudentsRepository studentsRepository;

	// getting all student record by using the method findaAll() of CrudRepository
	public List<Student> getAllStudents() {
		List<Student> student = new ArrayList<Student>();
		studentsRepository.findAll()
						  .forEach(student::add);
		return student;
	}

	// getting a specific record by using the method findById() of CrudRepository
	public Student getStudentById(int id) {
		return studentsRepository.findById(id).get();
	}

	// saving a specific record by using the method save() of CrudRepository
	public void save(Student student) {
		if(studentsRepository.existsById(student.getId())) {
			throw  new RuntimeException("Duplicated Student with id "+ student.getId());
		}
		studentsRepository.save(student);
	}

	// saving a specific record by using the method save() of CrudRepository
	public void update(Student student) {
		if(!studentsRepository.existsById(student.getId())) {
			throw  new ResourceNotFoundException("Unable to find resouce with id "+ student.getId());
		}
		studentsRepository.save(student);
	}

	// deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int id) {
		studentsRepository.deleteById(id);
	}

	// updating a record
	public void update(Student student, int bookid) {
		studentsRepository.save(student);
	}
}
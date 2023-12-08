package com.management.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.management.dao.StudentRepository;
import com.management.entity.Student;


@Service
public class StudentService {
	
	@Autowired
	StudentRepository sr;
	
	public Student register(Student std) {
		sr.save(std);
		return std;
	}
	
	public Student getStudent(int registerNo) {
		Optional<Student> std = sr.findByRegisterNo(registerNo);
				
		return std.isPresent() ? std.get() : new Student();
	}

	public String deleteStudent(int registerNo) {
		
		if(sr.findByRegisterNo(registerNo)==null) {
			return "Student is not available....!!!!!";
		} else {
			sr.deleteById(registerNo);
			return "Student has been deleted successfully...!!!!!!!";
		}
	}
	
	
	public Student upFirst(int registerNo, String fname) {
		Student std= getStudent(registerNo);
		if (std==null) {
			return std;
		}else {	
			std.setFname(fname);
			sr.save(std);
		return std;}
	}
	
	
	public Student upLast(int registerNo, String lname) {
		Student std= getStudent(registerNo);
		if (std==null) {
			return std;
		}else {	
			std.setLname(lname);
			sr.save(std);
		return std;}
	}
	
	
	public Student upFather(int registerNo, String faname) {
		Student std= getStudent(registerNo);
		if (std==null) {
			return std;
		}else {	
			std.setFaname(faname);
			sr.save(std);
		return std;}
	}
	
	
	public Student upMother(int registerNo, String mname) {
		Student std= getStudent(registerNo);
		if (std==null) {
			return std;
		}else {	
			std.setMname(mname);
			sr.save(std);
		return std;}
	}
	
	
	public Student upStandard(int registerNo, int standard) {
		Student std= getStudent(registerNo);
		if (std==null) {
			return std;
		}else {	
			std.setStandard(standard);
			sr.save(std);
		return std;}
	}
	
	
	public Student upRoll(int registerNo, int rollNo) {
		Student std= getStudent(registerNo);
		if (std==null) {
			return std;
		}else {	
			std.setRollNo(rollNo);
			sr.save(std);
		return std;}
	}
	
	
	public Student upEmail(int registerNo, String email) {
		Student std= getStudent(registerNo);
		if (std==null) {
			return std;
		}else {	
			std.setEmail(email);
			sr.save(std);
		return std;}
	}
	
	
	public Student upCon(int registerNo, int cnumber) {
		Student std= getStudent(registerNo);
		if (std==null) {
			return std;
		}else {	
			std.setCnumber(cnumber);
			sr.save(std);
		return std;}
	}
}

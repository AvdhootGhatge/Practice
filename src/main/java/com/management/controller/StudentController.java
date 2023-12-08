package com.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.management.entity.Student;
import com.management.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;
	
	@PostMapping("/register")
	public Student register(@RequestBody Student std) {
		
		return ss.register(std);
	}
	
	@GetMapping("/get")
	public Student getStudent(@RequestParam("registerNo")int registerNo) {
		
		return ss.getStudent(registerNo);
	}
	
	@PutMapping("/upFirst")
	public Student upFirst(@RequestParam("registerNo")int registerNo,
						  @RequestParam("fname")String fname) {
		return ss.upFirst(registerNo,fname);
	}
	
	@PutMapping("/upLast")
	public Student upLast(@RequestParam("registerNo")int registerNo,
						  @RequestParam("lname")String lname) {
		return ss.upLast(registerNo,lname);
	}
	
	@PutMapping("/upFather")
	public Student upFather(@RequestParam("registerNo")int registerNo,
						  @RequestParam("faname")String faname) {
		return ss.upFather(registerNo,faname);
	}
	
	@PutMapping("/upMother")
	public Student upMother(@RequestParam("registerNo")int registerNo,
						  @RequestParam("mname")String mname) {
		return ss.upMother(registerNo,mname);
	}
	
	@PutMapping("/upStandard")
	public Student upStandard(@RequestParam("registerNo")int registerNo,
						  @RequestParam("standard")int standard) {
		return ss.upStandard(registerNo,standard);
	}
	
	@PutMapping("/upRoll")
	public Student upRoll(@RequestParam("registerNo")int registerNo,
						  @RequestParam("rollNo")int rollNo) {
		return ss.upRoll(registerNo,rollNo); 
	}
	
	@PutMapping("/upEmail")
	public Student upEmail(@RequestParam("registerNo")int registerNo,
						  @RequestParam("email")String email) {
		return ss.upEmail(registerNo,email);
	}
	
	@PutMapping("/upCon")
	public Student upCon(@RequestParam("registerNo")int registerNo,
						  @RequestParam("cnumber")int cnumber) {
		return ss.upCon(registerNo,cnumber);
	}
	
	@DeleteMapping("/delete")
	public String deleteStudent(@RequestParam("registerNo") int registerNo) {
		return ss.deleteStudent(registerNo);
	}
}

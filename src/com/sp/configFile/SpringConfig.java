package com.sp.configFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.sp.beans.Student;

@Configuration
public class SpringConfig {

	@Bean("stdId0")
	public Student stdId() {
		Student student = new Student();
		student.setName("Eva");
		student.setRollNo(102);
		student.setEmail("eva@gmail.com");
		
		return student;
		
	}
	
	@Bean("stdId1")
	/*
	 * using @Primary it is fatch First data
	 */
	//@Primary 
	public Student stdId2() {
		Student student = new Student();
		student.setName("Riya");
		student.setRollNo(103);
		student.setEmail("riya@gmail.com");
		
		return student;
	}
}

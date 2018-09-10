package com.pcndotcom.courses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class CoursesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesApplication.class, args);
	}
	
	@RequestMapping("/")
	public String welcomeMsg() {
		return "Welcome to PCN Dot Com";
	}
	
	@RequestMapping("/courses")
	public List<String> getAllCourses() {
		List<String> list =  new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
				
		return list;

	}
	
	
	@RequestMapping("/course")
	public Map<String,String> getCourseDetail() {
		Map<String,String> map = new HashMap<String,String>();
		map.put("CourseID", "JAVA001");
		map.put("CourseName", "Core Java");
		map.put("Duration", "3 Weeks");
		map.put("Description", "Java Basics");
				
		return map;

	}
	
	
	
}

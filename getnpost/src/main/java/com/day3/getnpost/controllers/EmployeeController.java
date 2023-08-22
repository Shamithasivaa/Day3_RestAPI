package com.day3.getnpost.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day3.getnpost.model.*;
import com.day3.getnpost.service.*;
@RestController
public class EmployeeController {
	@Autowired
	  EmployeeService eser;
	  @PostMapping("/disp")

	  public Employee add(@RequestBody Employee e) {
		  return eser.saveinfo(e);
	  }
	  	@GetMapping("/show")
	  public List<Employee> show(){
		  return eser.showinfo();
	  }
}

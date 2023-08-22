package com.day3.getnpost.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day3.getnpost.model.Employee;
import com.day3.getnpost.repository.EmployeeRepo;
@Service
public class EmployeeService {
	@Autowired

	  EmployeeRepo er;

		public Employee saveinfo(Employee e) {

			return er.save(e);

		}

		public List<Employee> showinfo(){

			return er.findAll();

		}
}

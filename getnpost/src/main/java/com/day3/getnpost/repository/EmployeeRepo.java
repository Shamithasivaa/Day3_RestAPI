package com.day3.getnpost.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.day3.getnpost.model.Employee;

public interface EmployeeRepo extends
JpaRepository<Employee,Integer>{
}

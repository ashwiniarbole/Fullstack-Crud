package com.scp.boot.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityListeners;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scp.boot.model.Employee;
import com.scp.boot.service.EmployeeRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class EmployeeController {

		@Autowired
		EmployeeRepository empRepos;
		

		@PostMapping("/employees")
		public Employee createEmployee(@RequestBody Employee emp) {
			return empRepos.save(emp);
		}
		
		@GetMapping("/employees")
		public List<Employee> getAllEmployees(){
			return empRepos.findAll();
		}
		
		@GetMapping("/employees/{id}")
		public Employee getEmployee(@PathVariable(value="id") Long eid){
			return empRepos.getOne(eid);
		}
		
		@PutMapping("/employees")
		public Employee updateEmployee(@RequestBody Employee updateEmp){
				return empRepos.save(updateEmp);	
		}
		
		
		@DeleteMapping("/employees/{id}")
		public boolean deleteEmployee(@PathVariable(value = "id") Long empId) {
			empRepos.deleteById(empId);
			return true;
		}
}

package com.akkitech.Controller;



import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.akkitech.Model.Employee;
import com.akkitech.Service.EmployeeService;

@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeService service;
	
	@RequestMapping(value = "/index")
	public String name() {
		return "index";
	}
	
	@RequestMapping(value = "/add")
	public ModelAndView add() {
		ModelAndView mv=new ModelAndView("addEmp");
		return mv;
	}
	
	//Save Employee
	@PostMapping(value = "/employee")
	public ModelAndView add(Employee employee)
	{
		ModelAndView mv=new ModelAndView("/employees");
		service.add(employee);
		return mv;
		
	}
	

	/*
	//Save Multiple Employee
	@PostMapping(value = "/employees")
	public ModelAndView addAll(@RequestBody List<Employee> employee)
	{
		ModelAndView mv=new ModelAndView("listUser");
		service.addAll(employee);
		return mv;
		
	}
	*/
	
	//Fetch List of Employees
	@GetMapping(value = "/employees")
	public ModelAndView getAllEmployee()
	{
		ModelAndView mv=new ModelAndView("listEmp");
		List<Employee> employees=service.getAllEmployee();
		mv.addObject("employees", employees);
		return mv;
		

	}
	
	//Fetch Single Employee
	@GetMapping(value = "/employee/{id}")
	public ModelAndView getEmpById(@PathVariable("id") int id)
	{
		ModelAndView mv=new ModelAndView("/employees");
		service.getEmpById(id);
		return mv;
	}
	
	//Delete Employee
	@DeleteMapping(value = "/delete/{id}")
	public ModelAndView deleteEmpById(@PathVariable("id") int id)
	{
		ModelAndView mv=new ModelAndView("listEmp");
		service.deleteEmpById(id);
		return mv;
	}
	
	@RequestMapping(value = "/edit/{id}", method=RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") int id, Model model)
	{
		ModelAndView mv=new ModelAndView("editEmp");
		model.addAttribute("employee", service.getEmpById(id));
		return mv;
	}
	
	//Update Employee
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(Employee emp)
	{
		ModelAndView mv=new ModelAndView();
		service.updateById(emp);
		mv.setViewName("/employees");
		return mv;
	}
	
}

/* 
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.akkitech.Model.Employee;
import com.akkitech.Service.EmployeeService;

@RestController
public class EmployeeController {


	@Autowired
	EmployeeService service;
	@RequestMapping(value = "/index")
	public String name() {
		return "index";
	}
	
	//Save Employee
	@PostMapping(value = "/employee")
	public Employee add(Employee employee)
	{
		return service.add(employee);
		
	}
	
	//Save Multiple Employee
	@PostMapping(value = "/employees")
	public ModelAndView addAll(@RequestBody List<Employee> employee)
	{
		ModelAndView mv=new ModelAndView("/employees");
		service.addAll(employee);
		return mv;
	}
	
	//Fetch List of Employees
	@GetMapping(value = "/employees")
	public List<Employee> getAllEmployee()
	{
		return service.getAllEmployee();
		
	}
	
	//Fetch Single Employee
	@GetMapping(value = "/employee/{id}")
	public Employee getEmpById(@PathVariable("id") int id)
	{
		return service.getEmpById(id);
	}
	
	//Delete Employee
	@DeleteMapping(value = "/employee/{id}")
	public void deleteEmpById(@PathVariable("id") int id)
	{
		service.deleteEmpById(id);
	}
	
	//Update Employee
	@PutMapping(value = "/employee/{id}")
	public String updateById(@PathVariable("id") int id, Employee employee)
	{
		service.updateById(id, employee);
		return "Update Success....!!";

	}
	
	
}
*/

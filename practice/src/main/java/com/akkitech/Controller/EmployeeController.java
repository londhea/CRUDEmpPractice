package com.akkitech.Controller;



import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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

import net.bytebuddy.dynamic.scaffold.MethodGraph.NodeList;

@Controller
public class EmployeeController {

	
	@Autowired
	EmployeeService service;
	
	//Getting index page
	@RequestMapping(value = "/index")
	public String name() {
		return "index";
	}
	
	//Getting add Employee page
	@RequestMapping(value = "/add")
	public String add() {
		return "addEmp";
	}
	
	//Save Employee
	@PostMapping(value = "/employee")
	public String add(Employee employee)
	{
		service.add(employee);
		return "redirect:/employees";
	}
		
	//Fetch List of Employees
	@GetMapping(value = "/employees")
	public String getAllEmployee(Model model)
	{
		List<Employee> employees=service.getAllEmployee();
		model.addAttribute("employees", employees);
		return "listEmp";
		

	}
	
	//Fetch Single Employee
	@GetMapping(value = "/employee/{id}")
	public String getEmpById(@PathVariable("id") int id)
	{
		service.getEmpById(id);
		return "/employees";
	}
	
	//Delete Employee
	@GetMapping(value = "/delete/{id}")
	public String deleteEmpById(@PathVariable("id") int id)
	{
		service.deleteEmpById(id);
		return "redirect:/employees";
	}
	
	//Show Edit employee form
	@RequestMapping(value = "/edit/{id}", method=RequestMethod.GET)
	public String update(@PathVariable("id") int id, Model model)
	{
		model.addAttribute("employee", service.getEmpById(id));
		return "editEmp";
	}
	
	//Update Employee
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Employee emp)
	{
		service.updateById(emp);
		return "redirect:/employees";
	}
	
}

package com.akkitech.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.akkitech.Model.Employee;
import com.akkitech.Repository.EmpRepository;

@Service
public class EmployeeService {

	@Autowired
	EmpRepository repository;
	
	public Employee add(Employee employee)
	{
		Optional<Employee> emp = repository.findById(employee.getEid());
        
        if(emp.isPresent()) 
        {
            Employee emp1 = emp.get();
            emp1.setEname(employee.getEname());
            emp1.setEage(employee.getEage());
            emp1.setEgender(employee.getEgender());
            emp1.setEmobile(employee.getEmobile());
            emp1.setEsalary(employee.getEsalary());
            emp1.setEaddress(employee.getEaddress());
           
            emp1 = repository.save(emp1);
             
            return emp1;
        } else {
            employee = repository.save(employee);
             
            return employee;
        }
	}
	
	public List<Employee> addAll(List<Employee> employee)
	{
		return repository.saveAll(employee);
	}
	
	public List<Employee> getAllEmployee()
	{
		return repository.findAll();
	}
	
	public Employee getEmpById(int id)
	{
		Optional<Employee> emp =repository.findById(id);
		if(emp.isPresent())
		{
			return emp.get();
		}else {
			throw new RuntimeException("Employee not in databse with id :"+id);
		}
	}
	
	public void deleteEmpById(int id)
	{
		repository.deleteById(id);
	}
	
	public void updateById(Employee employee)
	{
		Optional<Employee> emp = repository.findById(employee.getEid());
        
        if(emp.isPresent()) 
        {
            Employee emp1 = emp.get();
            emp1.setEname(employee.getEname());
            emp1.setEage(employee.getEage());
            emp1.setEgender(employee.getEgender());
            emp1.setEmobile(employee.getEmobile());
            emp1.setEsalary(employee.getEsalary());
            emp1.setEaddress(employee.getEaddress());
           
            emp1 = repository.save(emp1);
             System.out.println("\nRecord updated..."+ emp1.toString());
             System.out.println("Record .. updated..."+ employee.toString());      
        } else 
        {
            employee = repository.save(employee);    
            System.out.println("Record not updated...");       
        }
	}
}

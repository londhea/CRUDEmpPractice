package com.akkitech.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.*;
import org.springframework.stereotype.Repository;

import com.akkitech.Model.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {
	
	

}

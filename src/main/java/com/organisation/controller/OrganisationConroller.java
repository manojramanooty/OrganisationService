package com.organisation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.organisation.datamodel.Employee;
import com.organisation.service.OrganisationService;

@RestController
@ComponentScan(basePackages="com.organisation.service")
public class OrganisationConroller {
	
	@Autowired
	OrganisationService organistationService;
	
	@GetMapping("/organisation/{id}/oldEmployees")
	public List<Employee> getOldEmployees(@PathVariable("id") Long id){		
		return organistationService.getOldEmployees(id);
	}

}

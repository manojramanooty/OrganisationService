package com.organisation.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.dao.OrganisationDao;
import com.organisation.datamodel.Employee;

@Service
@ComponentScan(basePackages="com.organisation.dao")
public class OrganisationService {

//	@Autowired
//	OrganisationDao organisationDao;
	@Autowired
	RestTemplate restTemplate;
	
	public List<Employee> getOldEmployees(Long id) {
		List<Employee> response = restTemplate.exchange("http://employee-server/employees", HttpMethod.GET,null, new ParameterizedTypeReference<List>() {}).getBody();
		List<Employee> oldEmployees = response.stream().filter(employee->employee.getAge()>50).collect(Collectors.toList());
		return oldEmployees;
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}

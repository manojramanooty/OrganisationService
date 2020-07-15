package com.organisation.datamodel;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Organisation {

	@Id
	private Long id;
	@NotNull
	private String companyName;
	@NotNull
	private String companyLocation;
	@OneToMany
	private List<Employee> employee;
	
}

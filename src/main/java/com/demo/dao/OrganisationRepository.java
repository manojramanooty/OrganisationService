package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organisation.datamodel.Organisation;

public interface OrganisationRepository extends JpaRepository<Organisation, Long>{

}

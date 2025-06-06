package com.digitiumitservices.ems.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitiumitservices.ems.entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String> {

	Optional<EmployeeEntity> findByEmpEmail(String email);
	
	

}

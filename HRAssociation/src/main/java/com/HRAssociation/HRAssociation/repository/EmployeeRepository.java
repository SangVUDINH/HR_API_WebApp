package com.HRAssociation.HRAssociation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.HRAssociation.HRAssociation.model.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
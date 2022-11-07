package com.evoke.demo.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.evoke.demo.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}

package org.example._1datajpaapp2.repo;

import org.example._1datajpaapp2.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface  EmployeeRepo extends CrudRepository<Employee,Integer> {
}

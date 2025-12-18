package org.example._1datajpaapp2.repo;

import org.example._1datajpaapp2.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface  EmployeeRepo extends CrudRepository<Employee,Integer> {

    List<Employee> findByEmpDept(String empDept);

    Boolean existsByEmpName(String empName);


}

package org.example._1datajpaapp2.repo;

import org.example._1datajpaapp2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface  EmployeeRepo extends JpaRepository<Employee,Integer> {

    List<Employee> findByEmpDept(String empDept);

    // This is the HQL query .
    @Query("SELECT e FROM Employee e WHERE e.empDept =:dept")
    List<Employee> findByEmpDepartmentUsingQuery(@Param("dept")  String dept);


    // This is SQL query.
    @Query(value = "select * from employee",nativeQuery = true)
    List<Employee> findBySqlQuery();

    //hql delete
    @Transactional
    @Modifying
    @Query("delete from Employee where empId =:empId")
    public void deleteEmp(@Param("empId") Integer empId);



    Boolean existsByEmpName(String empName);


    // writing the JpaRepository methods like -> pagination and sorting




}

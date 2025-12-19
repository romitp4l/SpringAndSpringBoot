package org.example._1datajpaapp2.service;


import org.example._1datajpaapp2.entity.Employee;
import org.example._1datajpaapp2.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepo employeeRepo;

    @Autowired
    public void EmployeeRepo(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
        System.out.println(this.employeeRepo.getClass().getName());
    }

    public void saveEmployee(){
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setEmpName("Jack");
        emp.setEmpGender("Male");
        emp.setEmpDept("Male");
        emp.setEmpDept("Sales");
        emp.setEmpSalary(15000.00);


        employeeRepo.save(emp);
    }


    public void saveMultipleEmployee(){
        Employee employee2 = new Employee();
        employee2.setEmpId(201);
        employee2.setEmpName("Sack");
        employee2.setEmpDept("Male");
        employee2.setEmpDept("Sales");
        employee2.setEmpSalary(15000.00);

        Employee employee1 = new Employee(202, "Tnuj", "IT", 78909039.00, "Male");
        Employee employee3 = new Employee(203, "Hnuj", "IT", 78909039.00, "Male");
        Employee employee4 = new Employee(204, "Lnuj", "IT", 78909039.00, "Male");
        Employee employee5 = new Employee(205, "Dnuj", "IT", 78909039.00, "Male");
        Employee employee6 = new Employee(206, "Jnuj", "IT", 78909039.00, "Male");
        Employee employee7 = new Employee(209, "Lnuj", "IT", 78909039.00, "Male");


        employeeRepo.saveAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6,employee7));


    }


    public void getEmp(){
        //optional class was introduced in java 1.8 to avoid NULLPOINTER-EXCEPTION , it returns boolean.
        Optional<Employee> findById = employeeRepo.findById(101);
        if (findById.isPresent()) {
            Employee employee = findById.get();
            System.out.println(employee);
        }
    }


//    public void getEmps(){
//        List<Integer> empIds = Arrays.asList(101, 201, 202,205,209);
//        Iterable<Employee> itr = employeeRepo.findAllById(empIds);
//        itr.forEach(System.out::println);
//    }


    public void getAllEmps(){
        Iterable<Employee> findAll = employeeRepo.findAll();
        findAll.forEach(System.out::println);
    }

    public void getEmpByDept(String empDept){
        List<Employee> employees = employeeRepo.findByEmpDept(empDept);
        employees.forEach(System.out::println);
    }

    public void  getByEmpDepartmentUsingQuery(String empDept){
        List<Employee> employees = employeeRepo.findByEmpDepartmentUsingQuery(empDept);
        employees.forEach(System.out::println);
    }

    public void  getAllBySql(){
        List<Employee> employees = employeeRepo.findBySqlQuery();
        employees.forEach(System.out::println);
    }

    public void getDeleteEmp(Integer empId){
        employeeRepo.deleteEmp(empId);
    }


    // JpaRepo methods
    // it can be made dynamic by taking variable as the function parameter

    public  void getEmps(){
        Sort sort = Sort.by("empSalary").descending();
        Iterable<Employee> findAll = employeeRepo.findAll(sort);
        findAll.forEach(System.out::println);
    }

    // pagination implimentation
    public void getEmpsWithPagination(int pageNumber, int pageSize){
        PageRequest of = PageRequest.of(pageNumber -1, pageSize);
        Page<Employee> findAll = employeeRepo.findAll(of);
        List<Employee> content = findAll.getContent();
        content.forEach(System.out::println);
    }

    // query by example QBE example

    public void getEmpsByQBE(){
        Employee emp = new Employee();

        // if user selects the department and multiple things can be selected
        emp.setEmpDept("IT");
        Example<Employee> of = Example.of(emp);

        List<Employee> findAll = employeeRepo.findAll(of);

        findAll.forEach(System.out::println);
    }



}

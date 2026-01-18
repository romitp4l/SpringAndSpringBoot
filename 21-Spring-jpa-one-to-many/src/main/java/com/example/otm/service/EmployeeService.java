package com.example.otm.service;


import com.example.otm.entity.Address;
import com.example.otm.entity.Employee;
import com.example.otm.repo.AddressRepo;
import com.example.otm.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private AddressRepo addressRepo;

    public void saveEmp(){
        Address a1 = new Address();
        a1.setCity("Kanpur");
        a1.setCountry("INDIA");
        a1.setState("UP");
        a1.setAddrType("Present");


        Address a2 = new Address();
        a2.setCity("Bangore");
        a2.setCountry("INDIA");
        a2.setState("KA");
        a2.setAddrType("Permanent");

        Employee e = new Employee();
        e.setEmpName("Romit");
        e.setEmpSalary(78000.0);


        // associating the address and the employee
        a1.setEmp(e);
        a2.setEmp(e);

        e.setAddr(Arrays.asList(a1,a2));

        // saving the parent of the relation

        employeeRepo.save(e);


        System.out.println("working fine");
    }

    public void getEmployee(){
        employeeRepo.findById(1);
    }

    public void getAddress(){
        addressRepo.findById(1);
    }

    public void deleteEmp(){
        employeeRepo.deleteById(1);
    }

}

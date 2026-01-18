package com.example.otm.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;
    private String empName;
    private Double empSalary;

    @OneToMany(
            mappedBy = "emp" ,
            cascade = CascadeType.ALL ,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private List<Address> addr;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    public List<Address> getAddr() {
        return addr;
    }

    public void setAddr(List<Address> addr) {
        this.addr = addr;
    }
}

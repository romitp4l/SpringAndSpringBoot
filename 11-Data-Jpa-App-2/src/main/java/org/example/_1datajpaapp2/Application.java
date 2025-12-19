package org.example._1datajpaapp2;

import org.example._1datajpaapp2.entity.Employee;
import org.example._1datajpaapp2.repo.EmployeeRepo;
import org.example._1datajpaapp2.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context
                = SpringApplication.run(Application.class, args);


        // Old method by using the direct employee object
//        EmployeeRepo employeeRepo = context.getBean(EmployeeRepo.class);
//        Employee employee1 = new Employee(102, "Anuj", "IT", 78909039.00, "Male");
//        employeeRepo.save(employee1);

        // new method by using the dependency injection
        // Here the employee object is directly created in the service method
        EmployeeService service = context.getBean(EmployeeService.class);

//        service.saveEmployee();
//        service.saveMultipleEmployee();
//        service.getEmp();
//        service.getEmps();
//        service.getAllEmps();

//        service.getEmpByDept("IT");

//        service.getByEmpDepartmentUsingQuery("CSE ");
//
//        service.getAllBySql();
//
//
//        service.getDeleteEmp(206);
//

//
//        service.getEmps();

//        service.getEmpsWithPagination(2,2);

        // QBE
        service.getEmpsByQBE();

    }


}

package demoApplication;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public  class DemoApplication {

    static List<Employee> employeeList = Arrays.asList(

            new Employee(1,"Abraham",32,"IT","Mumbai",20000,"Male"),
            new Employee(2,"Mary",21,"Sales","Chennai",25000,"Female"),
            new Employee(3,"Joe",32,"IT","Chennai",22000,"Male"),
            new Employee(4,"John",27,"Sales","Gurgaon",29000,"Male"),
            new Employee(5,"Liza",54,"Sales","Bangalore",32000,"Female"),
            new Employee(6,"Peter",33,"Admin","Mumbai",31500,"Male"),
            new Employee(7,"Harry",35,"Research","Kochi",21000,"Male"),
            new Employee(5,"Romit",25,"Research","Kanpur",21000,"Male")
    );

    public static void main(String[] args) {
    System.out.println(" Here are the solution of the 15 questions : ");

        //1.Find the list of employees whose name starts with "A".

        List<Employee> employeeWhoseNameStartsWithA = employeeList.stream().filter(employee -> employee.getName().startsWith("A")).collect(Collectors.toList());

        System.out.println("Employees whose name starts with A \n" +employeeWhoseNameStartsWithA);


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        //2.Group the employees by Department names.

        Map<String, List<Employee>> employeesWithDeptName = employeeList.stream().collect(Collectors.groupingBy(Employee::getDapartName));

        System.out.println("List of employees with department names ");
        employeesWithDeptName.forEach((dept,empList) -> {
            System.out.println(dept);
            empList.forEach(emp -> {
                System.out.println(emp.getId());;
                System.out.println(emp.getName());;
                System.out.println(emp.getAge());;
                System.out.println(emp.getDapartName());;
                System.out.println( emp.getAddress());;
                System.out.println(emp.getSalary());
                System.out.println(emp.getGender());
            });

            System.out.println("-----------------------------------------------------------------------------");
        });

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        //3.Find the total count of employees using stream.

        long count = employeeList.stream().count();
        System.out.println("Total number of employees : " + count);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //4.Find the max age of employees.

        int maxAge = employeeList.stream().mapToInt(Employee::getAge).max().getAsInt();
        System.out.println("Max Age : " + maxAge);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    //5.Find all department names.
        Set<String> allDeptNames = employeeList.stream().map(Employee::getDapartName).collect(Collectors.toSet());
        System.out.println("All department names : " +allDeptNames);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    //6.Find the count of employees in each department.
        Map<String, Long> employeeCountByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDapartName, Collectors.counting()));
        System.out.println("Employee count by department");
        employeeCountByDept.forEach((dept,value) ->{
            System.out.println(dept +"   :  "+ value);
        } );

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    //7.Find the list of employees whose age is less than 30.
        Set<Employee> ageLessThan30 = employeeList.stream().filter(employee -> employee.getAge() < 30).collect(Collectors.toSet());

        System.out.println("Employees having age less than 30"+ageLessThan30);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    //8.Find the list of employees whose age is between 26 and 31

        List<Employee> ageBetween26and31 = employeeList.stream().filter(employee -> employee.getAge() < 31 && employee.getAge() > 26).collect(Collectors.toList());
        System.out.println("Employees having age between 26 and 31"+ageBetween26and31);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    //9.Find the average age of male and female employees.
        Map<String, Double> avgAgeOfMaleAndFemale = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
        System.out.println("Average age of Male and Female employees :");
        avgAgeOfMaleAndFemale.forEach((gender,age) ->{
            System.out.println(gender +"   :  "+ age   );
        });

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    //10.Find the department who is having the maximum number of employees.
        Map.Entry<String, Long> deptMaxEmp = employeeList.stream().collect(Collectors.groupingBy(Employee::getDapartName, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();

        System.out.println("Department having maximum number of employees  is \n"+ deptMaxEmp.getKey() +" \nand the employees number is  "+deptMaxEmp.getValue());


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    //11.Find the Employee who stays in Delhi and sort them by their names.

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    //12.Find the average salary in all department.
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    //13.Find the highest salary in each department.
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    //14.Find the list of employee and sort them by their salary.
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    //15.Find the employee who as second highest salary.
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");



    }
}
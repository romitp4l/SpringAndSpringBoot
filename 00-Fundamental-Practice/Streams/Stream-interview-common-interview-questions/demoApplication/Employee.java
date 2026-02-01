package demoApplication;

public class Employee{
    private int id;
    private String name;
    private int age;
    private String dapartName;
    private String address;
    private double salary;
    private String gender;

    public Employee(int id, String name, int age, String dapartName, String address, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dapartName = dapartName;
        this.address = address;
        this.salary = salary;
        this.gender = gender;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dapartName='" + dapartName + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDapartName() {
        return dapartName;
    }

    public void setDapartName(String dapartName) {
        this.dapartName = dapartName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
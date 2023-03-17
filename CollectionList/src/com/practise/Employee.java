 package com.practise;

 import java.util.ArrayList;
 import java.util.Comparator;
 import java.util.List;
 import java.util.Set;
 import java.util.stream.Collectors;

 public class Employee {
     private String name;
     private static String departmentName;
     private int salary;
     private String city;

     public Employee(String name, String departmentName, int salary, String city) {
         this.name = name;
         Employee.departmentName = departmentName;
         this.salary = salary;
         this.city = city;
     }

     public String getName() {
         return name;
     }

     public String getDepartmentName() {
         return departmentName;
     }

     public int getSalary() {
         return salary;
     }

     public void setSalary(int salary) {
         this.salary = salary;
     }

     public String getCity() {
         return city;
     }

     public void setCity(String city) {
         this.city = city;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setDepartmentName(String departmentName) {
         Employee.departmentName = departmentName;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "name='" + name + '\'' +
                 ", departmentName='" + departmentName + '\'' +
                 ", salary=" + salary +
                 '}';
     }

     public static void main(String[] args) {
         List<Employee> employees = new ArrayList<>();
         employees.add(new Employee("Krishna", "Marketing", 50000, "kota"));
         employees.add(new Employee("Alok", "IT", 60000, "noida"));
         employees.add(new Employee("Nishant", "HR", 55000, "bhopal"));
         employees.add(new Employee("Aayush", "IT", 65000, "noida"));
         employees.add(new Employee("Abhishek", "Sales", 70000, "noida"));
         employees.add(new Employee("Krishna", "Operation", 50000, "kota"));
         employees.add(new Employee("Avinash", "Sales", 70000, "noida"));
         employees.add(new Employee("Shashank", "Operation", 50000, "noida"));

         Set<String> cities = employees.stream()
                 .map(Employee::getCity)
                 .collect(Collectors.toSet());

         for (String city : cities) {
             List<Employee> cityEmployees = searchEmployeeByCity(employees, city);
             System.out.println(city + " employees: " + cityEmployees);
         }
         
         // problem 1: provide all employees by a given departmentName
         String departmentName = "HR";
         List<Employee> employeesByDepartment = employees.stream()
                 .filter(e -> e.getDepartmentName().equals(Employee.departmentName))
                 .collect(Collectors.toList());
         System.out.println("Employees in " + departmentName + " department: " + employeesByDepartment);
         // problem 2: provide a employee, having n'th max salary
         int n = 2;
         Employee nthMaxSalaryEmployee = employees.stream()
                 .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                 .skip(n - 1)
                 .findFirst()
                 .orElse(null);
         System.out.println(n + "th max salary employee: " + nthMaxSalaryEmployee);

         // problem 3: provide all employees, given name and department name
         String name = "Krishna";
         departmentName = "HR";
         List<Employee> employeesByNameAndDepartment = employees.stream()
                 .filter(e -> e.getName().equals(name) && e.getDepartmentName().equals(Employee.departmentName))
                 .collect(Collectors.toList());
         System.out.println("Employees with name " + name + " and in " + departmentName + " department: "
                 + employeesByNameAndDepartment);

         // problem 4: increase all employee's salary with 30% increment
         employees.forEach(e -> e.setSalary((int) (e.getSalary() * 1.3)));
         System.out.println("Employees after salary increment: " + employees);
     }

     public static List<Employee> searchEmployeeByCity(List<Employee> employees, String city) {
         return employees.stream()
        		 .filter(e -> e.getCity().equals(city))
                 .collect(Collectors.toList());
     }
 }



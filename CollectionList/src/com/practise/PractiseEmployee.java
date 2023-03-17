package com.practise;

import java.util.ArrayList;
import java.util.List;

public class PractiseEmployee {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int salary;

    public PractiseEmployee(int id, String firstName, String lastName, int age, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

   
	@Override
	public String toString() {
		return "PractiseEmployee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", salary=" + salary + "]";
	}


	public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        List<PractiseEmployee> employees = new ArrayList<>();
        employees.add(new PractiseEmployee(1, "Shashank", "Shankar", 25, 50000));
        employees.add(new PractiseEmployee(2, "Krishna", "Kumar", 30, 60000));
        employees.add(new PractiseEmployee(3, "Alok", "jha", 35, 70000));
        employees.add(new PractiseEmployee(4, "Abhishek", "Kumar", 40, 80000));
        employees.add(new PractiseEmployee(5, "Nitesh", "Tripathi", 45, 90000));
        employees.add(new PractiseEmployee(1, "Shashank", "Shankar", 25, 50000));
        employees.add(new PractiseEmployee(2, "Krishna", "Kumar", 30, 60000));
        employees.add(new PractiseEmployee(8, "Nishant", "Chauhan", 60, 120000));

        List<PractiseEmployee> filteredEmployees = employees.stream()
                .filter(e -> e.getId() > 6 && e.getFirstName().startsWith("N"))
                .toList();

        System.out.println("Filtered Employees: " + filteredEmployees);
    }
}

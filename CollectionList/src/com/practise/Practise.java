package com.practise;

import java.util.ArrayList;
import java.util.List;

public class Practise {
	private String name;
	private String id;
	private double salary;

	public Practise(String name, String id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}



	public void setSalary(double d) {
		this.salary = d;
	}
	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + "";
	}

	public static void main(String[] args) {
		List<Practise> l=new ArrayList<>();
		l.add(new Practise("shashank","1",65000));
		l.add(new Practise("shashan","71",55000));
		l.add(new Practise("shaank","19",85000));
		l.add(new Practise("shaank","18",95000));
		l.add(new Practise("shasnk","15",75000));
		
		l.forEach(e->e.setSalary((int) e.getSalary()*1.3));
		
		
		
	}
}









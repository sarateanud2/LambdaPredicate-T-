package com.lambda.employeespredicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.lambda.employees.Employee;

public class EmployeePredicate {
	
	//Scriem conditia pentru a verifica daca este adult
	public static Predicate<Employee> isAdult(){
		return p -> p.getAge() >= 18;
		
	}
	
	//Scriem conditia pentru salariu
	public static Predicate<Employee> isGoodSalry(){
		return x -> x.getSalary() > 5000;
	}
	
	public static List<Employee> filterEmplyee(List<Employee> employees, Predicate<Employee> predicate){
		return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
	}
}

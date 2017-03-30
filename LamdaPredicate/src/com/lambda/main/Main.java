package com.lambda.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.lambda.employees.Employee;

//Metodele statice putem sa le importam si sa le folosim fara a crea referinta lor
import static com.lambda.employeespredicate.EmployeePredicate.*;

public class Main {
	public static void main(String[] args){
		List<Employee> employeList = new ArrayList<Employee>();
		
		employeList.addAll(Arrays.asList(new Employee[]{
				new Employee(1,25,3000),
				new Employee(2,18,5000),
				new Employee(3,26,10000),
				new Employee(4,17,5000)
		}));
		
		System.out.println(filterEmplyee(employeList, isAdult()));
		System.out.println(filterEmplyee(employeList, isGoodSalry()));
	}
	
}

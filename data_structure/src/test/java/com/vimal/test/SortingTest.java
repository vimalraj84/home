package com.vimal.test; 

import java.util.Collections;
import java.util.List;

import com.vimal.bo.emp.EmpComparator;
import com.vimal.bo.emp.Employee;
import com.vimal.bo.utils.StubGenerator;

public class SortingTest {
	
	public static void main(String[] a) {
		List<Employee> emps = StubGenerator.getEmployeeList();
		System.out.println("BEFORE SORTING : ");
		emps.forEach(e -> System.out.println(e.getName().getfName()+" "+e.getName().getlName()+" "+e.getAge()));
		
		Collections.sort(emps, new EmpComparator());
		System.out.println("\n\nAFTER SORTING : ");
		emps.forEach(e -> System.out.println(e.getName().getfName()+" "+e.getName().getlName()+" "+e.getAge()));
	}
}

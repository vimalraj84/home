package com.vimal.test; 

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vimal.bo.emp.EmpComparator;
import com.vimal.bo.emp.Employee;
import com.vimal.bo.utils.StubGenerator;

public class SortingTest {
	
	List<Employee> emps = null;
	@BeforeEach
	void setUp() throws Exception {
		emps = StubGenerator.getEmployeeList();
	}
	
	@Test
	final void testSort() throws Exception {
		System.out.println("BEFORE SORTING : ");
		emps.forEach(e -> System.out.println(e.getName().getfName()+" "+e.getName().getlName()+" "+e.getAge()));
		
		Collections.sort(emps, new EmpComparator());
		System.out.println("\n\nAFTER SORTING : ");
		emps.forEach(e -> System.out.println(e.getName().getfName()+" "+e.getName().getlName()+" "+e.getAge()));
	}
	
}

package com.test.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.test.bo.emp.EmpId;
import com.test.bo.emp.EmpSex;
import com.test.bo.emp.Employee;

public class StreamReduction {

    public static void main (String[] a){
        Map<EmpId, Employee> input = StubGenerator.getEmpData();
        Map<EmpSex, List<Employee>> empGroup = input.entrySet().stream()
                .map(entry -> entry.getValue())
                .sorted((emp1,emp2) -> emp1.getName().getfName().compareTo(emp2.getName().getfName()))
                .collect(Collectors.groupingBy(Employee::getSex));
        System.out.println("Male Employee :\n "+ empGroup);
    }
}

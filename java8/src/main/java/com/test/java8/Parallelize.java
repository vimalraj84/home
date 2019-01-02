package com.test.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.test.bo.emp.EmpId;
import com.test.bo.emp.EmpSex;
import com.test.bo.emp.Employee;

public class Parallelize {

    public static void main (String[] a){
        Map<EmpId, Employee> input = StubGenerator.getEmpData();

        List<Integer> parallelStorage = Collections.synchronizedList(new ArrayList<>());

        List<Employee> output = input.entrySet()
                .parallelStream()
                .map(emp -> emp.getValue())
                .distinct()
                .filter(emp -> emp.getSex().equals(EmpSex.FEMALE))
                .collect(Collectors.toList());

        System.out.println(output);


    }
}

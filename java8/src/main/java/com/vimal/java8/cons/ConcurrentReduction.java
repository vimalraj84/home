package com.vimal.java8.cons;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

import com.vimal.bo.emp.EmpId;
import com.vimal.bo.emp.EmpSex;
import com.vimal.bo.emp.Employee;
import com.vimal.bo.utils.StubGenerator;

public class ConcurrentReduction {

    public static void main (String[] a){
        Map<EmpId, Employee> input = StubGenerator.getEmpData();
        //Concurrent Reduction
        ConcurrentMap<EmpSex, List<Employee>> output = input.entrySet().parallelStream()
                .map(entry -> entry.getValue())
                .collect(Collectors.groupingByConcurrent(Employee::getSex));
        System.out.println(output);
    }
}
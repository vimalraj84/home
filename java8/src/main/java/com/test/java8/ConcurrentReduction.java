package com.test.java8;

import com.test.bo.EmpId;
import com.test.bo.EmpSex;
import com.test.bo.Employee;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

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

package com.test.java8;

import com.test.bo.EmpId;
import com.test.bo.Employee;

import java.util.Map;

public class Parallelize {

    public static void main (String[] a){
        Map<EmpId, Employee> input = StubGenerator.getEmpData();

//        List<Integer> parallelStorage = Collections.synchronizedList(new ArrayList<>());
//
//        List<Employee> output = input.entrySet()
//                .parallelStream()
//                .map(emp -> emp.getValue())
//                .distinct()
//                .filter(emp -> emp.getSex().equals(EmpSex.FEMALE))
//                .forEach(emp -> parallelStorage.add(emp));

//        System.out.println(output);


    }
}

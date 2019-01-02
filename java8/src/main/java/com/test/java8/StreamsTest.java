package com.test.java8;

import com.test.bo.EmpId;
import com.test.bo.EmpName;
import com.test.bo.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsTest {

    public static void main(String[] a){

        Map<EmpId, Employee> input = MethodRefs.getEmpData();

        List<EmpName> empLNameList =  input.entrySet().stream()
                .map(emp -> emp.getValue().getName())
                .distinct()
                .sorted((empNm1,empNm2) -> empNm1.getlName().compareTo(empNm2.getlName()))
                .collect(Collectors.toList());

        System.out.println(empLNameList);


        List<EmpName> empFNameList = input.entrySet().stream()
                .map(emp -> emp.getValue().getName())
                .distinct()
                .sorted(Comparator.comparing(EmpName::getfName))
                .collect(Collectors.toList());

        System.out.println(empFNameList);

//        List<EmpId> empIds = input.entrySet().stream()
//                .map(emp -> emp.getKey().getId())
//                .sorted(Comparator.comparingInt(EmpId::getId))
//                .collect(Collectors.toList());
//        System.out.println(empIds);

    }

}

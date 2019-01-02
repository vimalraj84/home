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

        Map<EmpId, Employee> input = StubGenerator.getEmpData();

        List<EmpName> empLNameList =  input.entrySet().stream()
                .map(entry -> entry.getValue().getName())
                .distinct()
                .sorted((empNm1,empNm2) -> empNm1.getlName().compareTo(empNm2.getlName()))
                .collect(Collectors.toList());
        System.out.println("Employees Sorted by Last Name :\n " + empLNameList);


        List<EmpName> empFNameList = input.entrySet().stream()
                .map(entry -> entry.getValue().getName())
                .distinct()
                .sorted(Comparator.comparing(EmpName::getfName))
                .collect(Collectors.toList());
        System.out.println("Employees Sorted by First Name :\n " + empFNameList);

        List<EmpId> empIds = input.entrySet().stream()
                .map(entry -> entry.getKey())
                .sorted(Comparator.comparing(EmpId::getId))
                .collect(Collectors.toList());
        System.out.println("Employees Sorted by Id :\n " + empIds);


        List<Integer> empNos = input.entrySet().stream()
                .map(entry -> entry.getKey().getId())
                .sorted((empId1,empId2) -> empId1.compareTo(empId2))
                .collect(Collectors.toList());
        System.out.println("Employees Sorted by Id :\n " + empNos);


        List<Long> empSsn = input.entrySet().stream()
                .map(entry -> entry.getKey().getSsn())
                .sorted((empS1,empS2) -> empS1.compareTo(empS2))
                .collect(Collectors.toList());
        System.out.println("Employees Sorted by SSN :\n " + empSsn);
    }

}

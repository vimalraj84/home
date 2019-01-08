package home.vimal.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import home.vimal.bo.emp.EmpId;
import home.vimal.bo.emp.EmpSex;
import home.vimal.bo.emp.Employee;

public class StreamFilter {

    public static void main(String[] a){

        Map<EmpId, Employee> input = StubGenerator.getEmpData();

        //Filter
        List<Employee> maleEmps = input.entrySet().stream()
                .map(entry -> entry.getValue())
                .filter(emp -> EmpSex.MALE.equals(emp.getSex()))
                .sorted((emp1,emp2) -> emp1.getName().getfName().compareTo(emp2.getName().getfName()))
                .collect(Collectors.toList());
        System.out.println("Male Employee :\n "+ maleEmps);


        List<Employee> femaleEmps = input.entrySet().stream()
                .map(entry -> entry.getValue())
                .filter(emp -> EmpSex.FEMALE.equals(emp.getSex()))
                .sorted((emp1,emp2) -> emp1.getName().getfName().compareTo(emp2.getName().getfName()))
                .collect(Collectors.toList());
        System.out.println("Female Employee :\n "+ femaleEmps);
    }
}
package home.vimal.java8;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

import home.vimal.bo.emp.EmpId;
import home.vimal.bo.emp.EmpSex;
import home.vimal.bo.emp.Employee;

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

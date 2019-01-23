package home.vimal.java8;

import java.util.Map;

import home.vimal.bo.emp.EmpId;
import home.vimal.bo.emp.Employee;

public class StreamReduction {

    public static void main (String[] a){
        Map<EmpId, Employee> input = StubGenerator.getEmpData();
        
        Employee emp = input.entrySet().stream()
                .map(entry -> entry.getValue())
                .reduce((emp1,emp2) -> emp1.getPay().getPayRate() * emp1.getPay().getPayFreq() > emp2.getPay().getPayRate() * emp2.getPay().getPayFreq() ? emp1 :emp2).get();
        System.out.println(String.format("Highly paid Employee: %s \n\t pay rate: %s \n\t pay frequency: %s \n\t Gross Pay: %s",emp.getName().toString(),emp.getPay().getPayRate(),emp.getPay().getPayFreq(),emp.getPay().getPayRate()*emp.getPay().getPayFreq()));
    }
}

package home.vimal.java8;

import home.vimal.bo.emp.EmpId;
import home.vimal.bo.emp.EmpName;
import home.vimal.bo.emp.EmpPay;
import home.vimal.bo.emp.EmpSex;
import home.vimal.bo.emp.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class StubGenerator {

    public static Map<EmpId, Employee> getEmpData(){
        //Using Employee class
        Map<EmpId, Employee> empMap = new HashMap<>();

        //Before Java 8
        EmpId empId = new EmpId(101,123456781l);
        EmpName empName = new EmpName("Caitlin","Summer");
        EmpPay empPay = new EmpPay();
        empPay.setPayFreq(25);
        empPay.setPayRate(2000);
        empMap.put(empId, new Employee(empId,empName,empPay,EmpSex.FEMALE));


        //Using Lambda
        EmpId empId2 = new EmpId(102,12355678l);
        empMap.computeIfAbsent(empId2, id -> new Employee(id, new EmpName("Anna","Robert"),empPay, EmpSex.FEMALE));

        empMap.computeIfAbsent(new EmpId(333,42345678l), id -> new Employee(empId2, new EmpName("Kate","Gee"),EmpSex.FEMALE));

        //Supplier
        Supplier<EmpId> empIdSupplier = ()->{
            return new EmpId(104,62345678);
        };
        Supplier<EmpName> empNameSupplier = ()->{
            return new EmpName("Mia","Ashley");
        };
        empMap.computeIfAbsent(empIdSupplier.get(),id -> new Employee(id,empNameSupplier.get(),EmpSex.FEMALE));


        empMap.computeIfAbsent(new EmpId(205,32346676l), id-> new Employee(id,new EmpName("Grace","Kelly"),EmpSex.FEMALE));

        empMap.computeIfAbsent(new EmpId(111,72545678l), id-> new Employee(id,new EmpName("Aria","Gomez"),EmpSex.FEMALE));

        empMap.computeIfAbsent(new EmpId(117,212345678l), id-> new Employee(id,new EmpName("Noelle","Gray"),EmpSex.FEMALE));

        empMap.computeIfAbsent(new EmpId(818,406343608l), id-> new Employee(id,new EmpName("Alex","Gray"),EmpSex.MALE));

        empMap.computeIfAbsent(new EmpId(555,812305878l), id-> new Employee(id,new EmpName("Rayn","Davis"),EmpSex.MALE));

        empMap.computeIfAbsent(new EmpId(666,618895098l), id-> new Employee(id,new EmpName("Mark","Tucker"),EmpSex.MALE));

        empMap.computeIfAbsent(new EmpId(666,617090998l), id-> new Employee(id,new EmpName("Gary","Rose"),EmpSex.OTHER));

        empMap.computeIfAbsent(new EmpId(666,708093008l), id-> new Employee(id,new EmpName("Trisha","Muller"),EmpSex.FEMALE));

        System.out.println("Printed with regular :"+ empMap);
        return empMap;
    }

}

package com.test.java8;

import com.test.bo.EmpId;
import com.test.bo.EmpName;
import com.test.bo.EmpPay;
import com.test.bo.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class MethodRefs {

    public static void main (String[] a){

        //Initial Testing

        Map<String,String> map = new HashMap<>();
        map.put("1","One");
        map.put("2","Two");
        System.out.println(map);
        map.computeIfAbsent("1" , k->"Three");
        System.out.println(map);
        map.computeIfAbsent("3" , k->"Three");
        System.out.println(map);
        map.computeIfAbsent("4" , v->new String("Four"));
        System.out.println(map);
        map.computeIfAbsent("5" , String::new);
        System.out.println(map);

        getEmpData();


    }


    public static Map<EmpId, Employee> getEmpData(){
        //Using Employee class
        Map<EmpId, Employee> empMap = new HashMap<>();

        EmpId empId = new EmpId(1,1231l);
        EmpName empName = new EmpName("Caitlin","Summer");
        empMap.put(empId, new Employee(empId,empName));
        System.out.println("Printed with regular :"+ empMap);

        EmpId empId2 = new EmpId(2,1232l);

        empMap.computeIfAbsent(empId2, id -> new Employee(id, new EmpName("Anna","Robert")));

        System.out.println("Printed with computeIfAbsent::Lamda :"+ empMap);


        empMap.computeIfAbsent(new EmpId(3,1233l), id -> new Employee(empId2, new EmpName("Michelle","Gee")));
        System.out.println("Printed with computeIfAbsent::Lamda :"+ empMap);


        Supplier<EmpId> empIdSupplier = ()->{
            return new EmpId(4,1234l);
        };

        Supplier<EmpName> empNameSupplier = ()->{
            return new EmpName("Mia","Ashley");
        };

        empMap.computeIfAbsent(empIdSupplier.get(),id -> new Employee(id,empNameSupplier.get()));
        System.out.println("Printed with Supplier::Lamda :"+ empMap);


        empMap.computeIfAbsent(new EmpId(5,1235l), id-> new Employee(id,new EmpName("Grace","Kelly")));
        System.out.println("Printed with computeIfAbsent::Lamda :"+ empMap);

        empMap.computeIfAbsent(new EmpId(6,1236l), id-> new Employee(id,new EmpName("Aria","Gomez")));
        System.out.println("Printed with computeIfAbsent::Lamda :"+ empMap);

        empMap.computeIfAbsent(new EmpId(7,1236l), id-> new Employee(id,new EmpName("Noelle","Gray")));
        System.out.println("Printed with computeIfAbsent::Lamda :"+ empMap);

        return empMap;
    }


}

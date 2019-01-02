package com.test.bo;

public class Employee {
    private EmpId empId;
    private EmpName name;
    private EmpPay pay;

    public Employee(EmpId empId, EmpName name) {
        this.empId = empId;
        this.name = name;
    }

    public Employee(EmpId empId, EmpName name, EmpPay pay) {
        this.empId = empId;
        this.name = name;
        this.pay = pay;
    }

    public EmpId getEmpId() {
        return empId;
    }

    public EmpPay getPay() {
        return pay;
    }

    public void setPay(EmpPay pay) {
        this.pay = pay;
    }

    public void setEmpId(EmpId empId) {
        this.empId = empId;
    }

    public EmpName getName() {
        return name;
    }

    public void setName(EmpName name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name=" + name +
                '}';
    }
}

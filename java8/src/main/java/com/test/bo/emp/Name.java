package com.test.bo.emp;

@FunctionalInterface
public interface Name {
    public String getFullName();
    default void pringName(String fName, String lName,String mName){
        System.out.println(fName+""+mName+""+lName);
    }
}

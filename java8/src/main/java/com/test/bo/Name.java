package com.test.bo;

@FunctionalInterface
public interface Name {
    public String getFullName();
    default void pringName(){
        System.out.println();
    }
}

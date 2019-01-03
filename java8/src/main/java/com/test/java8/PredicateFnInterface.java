package com.test.java8;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateFnInterface {

    public static void main (String... a){

        int[] input = new int[]{1,2,3,4,5,7,8,9,0};

        Predicate<Integer> predicate = num -> (num %2 ==0);

        Arrays.stream(input).forEach(i -> {
            if(predicate.test(i)){
                System.out.println(i);
            }
        });


    }
}

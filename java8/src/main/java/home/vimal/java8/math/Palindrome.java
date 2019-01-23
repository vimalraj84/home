package home.vimal.java8.math;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Palindrome {

    public static void main (String[] a){
        String ip = "dad";
        System.out.println("Input: "+ ip);

        StringBuilder builder = new StringBuilder(ip);
        System.out.println("Is Palindrome: " + builder.reverse().toString().equalsIgnoreCase(ip));
        //String to integer array
        IntStream intStream = ip.chars();

        char[] ipCAry = ip.toCharArray();

        System.out.println("Is Palindrome: " + checkPalindrome(ip));
    }

    public static boolean checkPalindrome(String ip){
        return IntStream.range(0, ip.length() / 2).noneMatch(i -> ip.charAt(i) != ip.charAt(ip.length() - i - 1));
    }
}

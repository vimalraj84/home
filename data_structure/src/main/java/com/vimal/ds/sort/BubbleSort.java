package com.vimal.ds.sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSort {

	//comparison-based algorithm 
	//Each pair of adjacent elements is compared and the elements are swapped if they are not in order 
	//Not suitable for large data sets as its average 
	//worst case complexity are of Ο(n2) where n is the number of items. 

	public static void main (String[] a) {

		int[] ip = new int[] {40,12,90,43,56};


		//The sorting algorithm is a Dual-Pivot Quicksort. 
		//This algorithmoffers O(n log(n)) performance on many data sets that cause other
		//quicksorts to degrade to quadratic performance, and is typicallyfaster 
		//than traditional (one-pivot) Quicksort implementation
		Arrays.sort(ip);
		Arrays.stream(ip).forEach(System.out::println);
		
		bubbleSort7(ip);
		bubbleSort8(ip);
	}

	public static void bubbleSort7(int[] ip) {
		for(int i = 0; i<ip.length;i++) {
			int temp = 0;
			for(int j = i+1; j < ip.length ;j++) {
				if(ip[i] > ip[j]) {
					temp = ip[i];
					ip[j] = ip[i];
					ip[i] = temp;
					temp = 0;
				}
			}
		}
		Arrays.stream(ip).forEach(System.out::println);
	}
	
	public static void bubbleSort8(int[] ip) {
		
		IntStream.range(0,ip.length - 1).flatMap(i -> IntStream.range(1, ip.length-i)).forEach( j -> {
			int temp = 0;
			if(ip[j-1] > ip[j]) {
				temp = ip[j -1];
				ip[j -1] = ip[j];
				ip[j] = temp;
				temp = 0;
			}
		});
		
		Arrays.stream(ip).forEach(System.out::println);
	}
}

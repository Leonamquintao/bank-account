package com.bankaccount;

import java.util.Scanner;

public class ArrayChalenge {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public int[] getIntegers(int capacity) {
		
		int[] array = new int[capacity];
		
		System.out.println("Enter "+ capacity + " integer values: \r");
		
		for(int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		return array;
	}
	
	//----------------------------------------------------------------
	public void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("Element "+ i + " contents "+ array[i]);
		}
	}
	
	//----------------------------------------------------------------
	public int[] sortIntegers(int[] array) {
		
		int[] sortedArray = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			sortedArray[i] = array[i];
		}
		
		//Alternativa para cópia do array
		// int[] sortedArray = Arrays.copyOf(array, array.length);
		
		boolean flag = true;
		int temp;
		
		while(flag) {
			flag = false;
			for(int i = 0; i < sortedArray.length-1; i++) {
				if(sortedArray[i] > sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
				}
			}
		}
		
		return sortedArray;
	}
}



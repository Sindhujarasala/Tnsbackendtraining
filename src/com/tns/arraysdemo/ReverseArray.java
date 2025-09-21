package com.tns.arraysdemo;

public class ReverseArray {

	public static void main(String[] args) {
		// Reverse of an array
		
		        int[] arr = new int[] {1, 2, 3, 4};
		        System.out.println("The original array is: ");
		        for (int i = 0; i < arr.length; i++) {
		            System.out.print(arr[i] + " ");
		        }
		        System.out.println();
		        System.out.println("The Reversed array is: ");
		        for (int i = arr.length - 1; i >= 0; i--) {
		            System.out.print(arr[i] + " ");
		        }
		    }
		

	}



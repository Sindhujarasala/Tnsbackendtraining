package com.tns.arraysdemo;

public class MaxMinArray {

	public static void main(String[] args) {
		
		        int[] arr = {67, 49, 57, 75, 56};
		        int max = arr[0], min = arr[0];

		        for (int num : arr) {
		            if (num > max) {
		                max = num;
		            }
		            if (num < min) {
		                min = num;
		            }
		        }

		        System.out.println("Maximum: " + max);
		        System.out.println("Minimum: " + min);
		    }
		

	}



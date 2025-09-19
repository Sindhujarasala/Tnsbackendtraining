package com.tns.Operators;

//Demo class for Operators
public class OperatorsDemo {

	public static void main(String[] args) {
		
        int a = 10, b = 5;
        
        // Arithmetic operators
        System.out.println("Addition: " + (a + b));    
        System.out.println("Subtraction: " + (a - b)); 
        System.out.println("Multiplication: " + (a * b)); 
        System.out.println("Division: " + (a / b));
        
        // Relational operators
        System.out.println("Is a > b? " + (a > b));  
        
        // Logical operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));     
        System.out.println("x || y: " + (x || y));  
        
        // Increment operator
        System.out.println("a++ = " + (a++));          
        System.out.println("Now a = " + a);            
    }


	}



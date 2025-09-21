package com.tns.Datatypes;

public class StringOperations {

	public static void main(String[] args) {
		// Demo for Basic operations Of Strings

		        String s1="Sindhuja";
		        String s2="Rasala";

		        // Concatenation 

		        System.out.println("The conatenation of two strings is:"+s1+" "+s2);

		        // Length of string

		        System.out.println("The length of the string is:"+s1.length());
		        System.out.println("The length of the second string is:"+s2.length());

		        // Character at index

		        System.out.println("The character at the first index position is:"+s1.charAt(0)+" ,"+s2.charAt(2));

		        // Substring 

		        System.out.println("The substring of the string is:"+s1.substring(0, 6));

		        //  equality check 

		        System.out.println("Both strings are equal:"+s1.equals("Sindhuja")+" "+s2.equals("Rasala"));

		        // Uppercase operator

		        System.out.println("The characters are in Upper letters:"+s1.toUpperCase());
		        System.out.println("The characters are in lower case:"+s2.toLowerCase());
		    }

		

	}



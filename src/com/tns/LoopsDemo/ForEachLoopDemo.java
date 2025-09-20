package com.tns.LoopsDemo;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		
		int a[] = {49, 40, 57, 48};
        //for integer array
        for (int i : a) {
            System.out.println(i);
        }

        char ch[] = {'s', 'i', 'n', 'd', 'h', 'u','j','a'};
        for (char c : ch) {
            System.out.print(c);
        }
        System.out.println(" ");

        String s1[] = {"Sindhuja", "Rasala"};
        
        //for String array
        for (String s : s1) {
            System.out.print(s + " ");
        }
    }


	}



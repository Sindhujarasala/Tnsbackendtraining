package com.tns.ControlStatementsDemo;

    // Program for Switch 
public class SwitchDemo {

	public static void main(String[] args) {
		
		char x = 's';
        switch (x)
        {
            case 's':
            case 'S':
                System.out.println(x+" is a Letter");
                break;
                
            case 'r':
            case 'R':
                System.out.println(x+" is a Digit");
                break;
                
            case 'u':
            case 'U':
                System.out.println(x+" is White Space");
                break;
            case 'b':
            case 'B':
                System.out.println(x+" is Special Symbol");
                break;
            default:
                System.out.println(x+" is other than letter, digit, space or special symbol");
                break;
        }
    }


	}



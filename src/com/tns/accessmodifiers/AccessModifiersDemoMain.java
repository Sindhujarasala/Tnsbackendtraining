package com.tns.accessmodifiers;

public class AccessModifiersDemoMain {

	public static void main(String[] args) {
		
		// Create object of AccessModifiersDemo
        AccessModifiersDemo obj = new AccessModifiersDemo();

        // Accessing public method
        obj.publicMethod();

        // Accessing protected method (same package so allowed)
        obj.protectedMethod();

        // Accessing default method (same package so allowed)
        obj.defaultMethod();

        // Private method cannot be accessed directly
        // obj.privateMethod(); --> error because it is private it can be accessible within package only

        // But we can access it indirectly
        obj.callPrivate();
    }


	}



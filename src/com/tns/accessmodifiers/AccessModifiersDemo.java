package com.tns.accessmodifiers;

     // Program for AccessModifiers
public class AccessModifiersDemo {
	
    // Public method - accessible everywhere
    public void publicMethod() {
        System.out.println("This is a PUBLIC method.");
    }

    // Private method - accessible only within this class
    private void privateMethod() {
        System.out.println("This is a PRIVATE method.");
    }

    // Protected method - accessible within same package and subclasses
    protected void protectedMethod() {
        System.out.println("This is a PROTECTED method.");
    }

    // Default method (no modifier) - accessible only within same package
    void defaultMethod() {
        System.out.println("This is a DEFAULT (package-private) method.");
    }

    // Helper method to call private method (since main cannot access it directly)
    public void callPrivate() {
        privateMethod();
    
    }
}



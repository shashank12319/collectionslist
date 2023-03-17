package com.practise;


public class StaticClass {
   
    
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }
    
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }
    public static void main(String[] args) {
		StaticClass.staticMethod();
		//StaticClass.nonStaticMethod();
	}
}

package com.practise;

public class Main {
	public static void main(String[] args) {
	    if (args.length > 0) {
	        System.out.println("Printing command line arguments:");
	        for (String arg : args) {
	            System.out.println(arg);
	        }
	    } else {
	        System.out.println("No command line arguments found.");
	    }
	}

}

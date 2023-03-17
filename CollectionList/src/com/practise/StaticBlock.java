package com.practise;




class Test {

	static int i;
	
	int j;

	
	static
	{
		i = 10;
		System.out.println("static block called ");
	}
	
}

//Main class
public class StaticBlock {

	// Main driver method
	public static void main(String args[])
	{

		
		System.out.println(Test.i);
	}
}

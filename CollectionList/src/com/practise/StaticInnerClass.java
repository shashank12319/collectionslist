

package com.practise;

public class StaticInnerClass {
	public class OuterClass {
	    
	    private static int staticField = 0;

	    public static class InnerClass {
	        public void printStaticField() {
	            System.out.println(staticField);
	        }
	    }
	}

}

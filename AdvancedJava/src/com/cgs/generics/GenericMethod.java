package com.cgs.generics;

public class GenericMethod {
    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName()
                           + " = " + element);
    }
    
    public static void IntMethod(int x) {
    	System.out.println(x);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Calling generic method with Integer argument
		GenericMethod.genericDisplay(new Integer(11));
 
        // Calling generic method with String argument
        genericDisplay("GeeksForGeeks");
 
        // Calling generic method with double argument
        genericDisplay(new Float(1.0));
        
        IntMethod(4);
        //IntMethod("String");
	}

}

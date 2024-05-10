package com.cgs.generics;

import java.util.*;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creatinga an ArrayList without any type specified
        ArrayList al = new ArrayList();
 
        al.add(new String("Sachin"));
        al.add("Rahul");
        al.add(new Integer(10)); // Compiler allows this
 
        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);
 
        // Causes Runtime Exception
        Integer s3 = (Integer)al.get(2);
        
        for(Object s : al) {
        	System.out.println(s);
        }
        
        
	}
}

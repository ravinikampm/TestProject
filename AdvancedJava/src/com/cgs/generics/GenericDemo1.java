package com.cgs.generics;

import java.util.ArrayList;

public class GenericDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        // Creating a an ArrayList without any type specified
        ArrayList<String> al = new ArrayList<String>();
 
        al.add(new String("Sachin"));
        al.add("Rahul");
        al.add(new String("Juee")); // Compiler allows this
        
        ArrayList<int[]> a = new ArrayList<int[]>();
        // ArrayList<int> a = new ArrayList<int>();
 
        String s1 = al.get(0);
        String s2 = al.get(1);
 
        // Doesnot cause Runtime Exception
        String s3 = al.get(2);
        
        for(String s : al) {
        	System.out.println(s);
        }
        
	}

}

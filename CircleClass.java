package com.DSA.Comparable;

import java.util.Arrays;

public class CircleClass {
	
	

	public static void main(String[] args) {
		
         Circle arr[]= {
        		 new Circle(50),
        		 new Circle(20),
        		 new Circle(40),
        		 new Circle(30),
        		 new Circle(10)
         };
         Arrays.sort(arr);
         for(Circle c:arr)
         {
        	 System.out.println(c);
         }
	}
	

}

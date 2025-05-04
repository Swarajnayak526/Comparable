package com.DSA.Comparable;

public class Circle implements Comparable {
     int radius;
     
     
     public Circle(int radius)
     {
    	 this.radius=radius;
     }
     
     public int compareTo(Object e)
     {
    	// Circle c=(Circle)e.radius;
    	 return this.radius-((Circle)e).radius;
     }
     public String toString()
     {
    	 return "Circle radius ="+radius;
     }
     
}

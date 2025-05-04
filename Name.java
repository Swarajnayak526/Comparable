package com.DSA.Comparable;

import java.util.Arrays;

class Student implements Comparable<Student>


{
	String name;
	int id;
	public Student(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	 public int compareTo(Student  s)
	 {
		 return this.id-s.id;
	 }
	
	public String toString()
	{
		return "name "+name+" id "+id;
	}
	
}
public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student arr[]= {
				new Student("jaya",101),
				new Student ("ram",100),
				new Student("xyz",201),
				new Student("Abhi",105)
				
		};
		Arrays.sort(arr);
		for(Student s:arr)
		{
			System.out.println(s);
		}
		Arrays.sort(arr);
		for(Student s:arr)
		{
			System.out.println(s);
		}
		

	}

}

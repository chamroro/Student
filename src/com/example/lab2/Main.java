package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main{
	public static void main(String args[]){
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (orgered by name)");
		Student s1= new Student(101,"Kim",23);
		al.add(s1);
		Student s2= new Student(102,"Choi",21);
		al.add(s2);
		al.add(new Student(103,"Lee",20));
		al.add(new Student(103,"Park",21));
		al.add(new Student(103,"Kang",23));
		al.add(new Student(103,"Cho",24));
		al.add(new Student(103,"Chae",25));
		al.add(new Student(103,"Ju",26));
		al.add(new Student(103,"Bae",27));
		al.add(new Student(103,"Jang",28));
		
		Collections.sort(al);
		for(Student s : al) {
			System.out.println(s.toString());
		
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}
}
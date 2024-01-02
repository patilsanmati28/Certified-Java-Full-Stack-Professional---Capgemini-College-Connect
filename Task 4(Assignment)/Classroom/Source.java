package com.edu;

class Student{
	String name;
	int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
}

class Classroom{
	public String registerStudent (Student student) {
		if(!student.name.equals(student.name.toUpperCase())) {
			return "Block letters needed";
		}
		if (student.score < 0 || student.score > 100) {
            return "Invalid score";
        }
		 return "Registered";
	}
	public String studentCard(String card) {
		if(!card.matches("[0-9]+")) {
			return "Invalid card";
		}
		return"Valid card";
	}
	
}
public class Main1 {

	public static void main(String[] args) {
		Student s1=new Student("A",6); 
		Classroom cm=new Classroom();
		System.out.println( cm.registerStudent (s1));
		 
		 

	}

}

package Day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int age;
	String name;
	public Student(int age,String name) {
		this.age=age;
		this.name=name;
	}
	public String toString() {
		return "Student[age="+age+",name="+name+"]";
	}
	public int compareTo(Student s) {
		return this.age-s.age;
	}
}

public class Comparable_Student {
	public static void main(String[]args) {
		
		List<Student> stu= new ArrayList<>();
		stu.add(new Student(22,"hima"));
		stu.add(new Student(25,"sonu"));
		stu.add(new Student(22,"ruchi"));
		Collections.sort(stu);
		for(Student s:  stu) {
			
			System.out.println(s);
		}
		
	}

}

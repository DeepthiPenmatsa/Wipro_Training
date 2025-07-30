package Day10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable{
	private String name;
	private int age ;
	public A(String name , int age ) {
		super();
		this.age=age;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public A() {
		super();
	}
	
}
public class Comparable_Students {
	public static void main(String[] args) throws IOException {
		A obj= new A();
		obj.setAge(25);
		obj.setName("z");
		
		FileOutputStream out = new FileOutputStream("data.txt");
		ObjectOutputStream output = new ObjectOutputStream(out);
		
		output.writeObject(obj);
		out.close();
		output.close();
		System.out.println("Object has been serialized to data.txt");
	}

}

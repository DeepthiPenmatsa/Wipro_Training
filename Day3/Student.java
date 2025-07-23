package Day3;

class Student1 {
	   String name;
	   int age;
	   void display() {
	       System.out.println("Name: " + name);
	       System.out.println("Age: " + age);
	   }
	}
	public class Student {
	   private String name;
	   private int age;

	   public static void main(String[] args) {
	       Student1 s1 = new Student1();
	       s1.name = "Hima_Wipro";
	       s1.age = 22;
	       s1.display();
	   }

	}  

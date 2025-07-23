package Day3;

class Employees {
    private String name;
    private double salary;

    public void setName(String n) {
        name = n;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Employees emp = new Employees();
        emp.setName("Hima");
        emp.setSalary(40000);
        emp.display();
    }
}


	

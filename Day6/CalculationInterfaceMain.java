package Day6;

interface Calculator_Interface{
	double operation(double a,double b);
	default double addition(double a,double b) {
		return a+b;
	}
	static double multiply(double a,double b) {
		return a*b;
	}
	
}

class Calculator_Operation implements Calculator_Interface{
	public double operation(double a,double b) {
		return a-b;
	}
	
}

public class CalculationInterfaceMain{
	public static void main(String[] args) {
		Calculator_Interface ci = new Calculator_Operation();
		System.out.println(ci.operation(6.0,5.0));
		System.out.println(ci.addition(5.0, 3.0));
		System.out.println(Calculator_Interface.multiply(9,8));
	}
}
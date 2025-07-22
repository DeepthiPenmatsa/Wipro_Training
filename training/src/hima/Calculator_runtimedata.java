package hima;

public class Calculator_runtimedata {
	public int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args){
		Calculator_runtimedata calc = new
Calculator_runtimedata();
		int Sum =calc.add(3,4);
		System.out.println("Sum="+ Sum);
	}

}

package Day5;

abstract class Realestate {
	abstract void price();
	abstract void security();
}
class House extends Realestate{
	void price() {
		System.out.println("its costly then apartment");
	
	}
	void security() {
		System.out.println("less security");
		
	}
}
class Apaerment extends Realestate{
	void price() {
		System.out.println("its less costly then house");
	
	}
	void security() {
		System.out.println("more security");
		
	}
}
public class realestate_main{
	public static void main(String[]arg) {
		Realestate R= new House();
		R.price();
		R.security();
		
	}
}
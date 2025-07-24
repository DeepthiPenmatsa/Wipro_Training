package Day5;
public interface  Laptops {
	void deviceType();
	void compileSpeed();

}
class Desktop implements Laptops{
	public void deviceType() {
		System.out.println("Wipro Desktop");
	}
	public void compileSpeed() {
		System.out.println("code compile faster");
	}
}
class My_laptop implements Laptops{
	public void deviceType() {
		System.out.println(" My pc");
	}
	public void compileSpeed() {
		System.out.println("code compile slower than wipro desktop");
	}
	
}

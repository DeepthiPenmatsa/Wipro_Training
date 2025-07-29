package Day9;

public class FloatParse {
	public class ParseFloatExample {
	    public static void main(String[] args) {
	        String str = "12.34";                     // Step 1: String holding float value
	        float f = Float.parseFloat(str);          // Step 2: Convert string to float
	        System.out.println("Parsed float: " + f); // Step 3: Print the float value
	    }
	}
}
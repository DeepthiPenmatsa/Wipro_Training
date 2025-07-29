package Day9;

public class WrapperDouble {
    public static void main(String[] args) {
        double d = 45.67;
        Double obj = d;
        double e = obj;
        System.out.println("Value after unboxing: " + e);
    }
}
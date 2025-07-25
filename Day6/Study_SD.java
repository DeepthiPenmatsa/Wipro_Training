package Day6;

interface Study {

    
    void startSession();

    
    default void greetUser() {
        System.out.println(" Hi there, ready to conquer your study goals today?");
    }

    
    static void showPlatformInfo() {
        System.out.println(" Platform: BrainBloom - Smart Learning for Smart Women.");
    }
}

public class Study_SD implements Study {

    public void startSession() {
        System.out.println(" Session Started: Today's Focus - Java Basics & Coding Practice.");
    }

    public static void main(String[] args) {
       Study_SD sd = new Study_SD();

        sd.greetUser();             
        sd.startSession();          
        Study.showPlatformInfo(); 
    }
}
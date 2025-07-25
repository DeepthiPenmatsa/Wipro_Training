package Day6;


interface Printer {
 void print();
}


interface Scanner {
 void scan();
}


interface Fax {
 void fax();
}


interface Copier {
 void copy();
}


interface Machine {
  abstract void showDeviceType();     
 default void greet() {     
     System.out.println("Welcome to the Smart Office Machine!");
 }
}


public class SmartOfficeMachine implements Printer, Scanner, Fax, Copier, Machine {

 @Override
 public void print() {
     System.out.println("Printing document using SmartOfficeMachine...");
 }

 @Override
 public void scan() {
     System.out.println("Scanning document using SmartOfficeMachine...");
 }

 @Override
 public void fax() {
     System.out.println("Sending fax using SmartOfficeMachine...");
 }

 @Override
 public void copy() {
     System.out.println("Copying document using SmartOfficeMachine...");
 }

 @Override
 public void showDeviceType() {
     System.out.println("Device Type: All-in-One Smart Office Machine.");
 }

 
 @Override
 public void greet() {
     System.out.println("Hello! I’m your digital assistant for printing, scanning, faxing, and copying.");
 }

 
 public static void main(String[] args) {
     SmartOfficeMachine device = new SmartOfficeMachine();

     device.greet();
     device.showDeviceType();
     device.print();
     device.scan();
     device.fax();
     device.copy();
 }
}
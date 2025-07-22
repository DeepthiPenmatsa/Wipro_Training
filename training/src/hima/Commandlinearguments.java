package hima;

public class Commandlinearguments {
	public static void main(String[]args){
		if(args.length<2) {
			System.out.println("please provide two number.");
			return;
		}
		try {
			int a = Integer.parseInt(args[0]);
			int b =Integer.parseInt(args[1]);
			System.out.println("sum="+(a+b));
		}catch (NumberFormatException e ) {
			System.out.println("Invalid integer input:"+e.getMessage());
		}
	}

}

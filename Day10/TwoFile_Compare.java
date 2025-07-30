package Day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TwoFile_Compare {
	public static void main(String[] args) throws IOException{
		BufferedReader file1 = new BufferedReader(new FileReader("C:\\Users\\deept\\OneDrive\\Documents\\file2.txt"));
		BufferedReader file2 = new BufferedReader(new FileReader("C:\\Users\\deept\\OneDrive\\Documents\\file1.txt"));
		
		String line1 = "", line2 = "";
		boolean areEqual = true;
		while ((line1 = file1.readLine()) != null & (line2 = file2.readLine()) != null) {
			if (!line1.equals(line2)) {
				areEqual = false;
				break;
			}
		}
	
		if(file1.readLine() != null || file2.readLine() != null) {
			areEqual = false;
		}
		if(areEqual)
			System.out.println("Files are same.");
		else
			System.out.println("Files are different.");
		
		file1.close();
		file2.close();
	
	}
}
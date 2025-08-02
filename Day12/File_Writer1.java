
package Day12;

import java.io.FileWriter;
import java.io.IOException;


public class File_Writer1 {
	public static void main(String[] args) throws IOException {
		String content= "This is text writefile";
	
			//String w=System.getProperty("user.home");
			FileWriter writer1=new FileWriter("C:\\Users\\deept\\OneDrive\\Documents\\FFFF.txt");
			{
			writer1.write(content);
			writer1.close();
		
		System.out.println("Content written successfully done ");
	
	}


}
}
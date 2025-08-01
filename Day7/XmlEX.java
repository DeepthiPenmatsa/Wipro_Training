package Day7;

import java.io.BufferedReader;
import java.io.FileReader;

public class XmlEX {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\deept\\OneDrive\\Desktop\\data.xml"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Line: " + line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error reading XML: " + e.getMessage());
        } finally {
            System.out.println("Code Executed......");
        }
    }
}
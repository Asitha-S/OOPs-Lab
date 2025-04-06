import java.io.FileReader; 
import java.io.IOException; 

public class fileii { 
    public static void main(String[] args) { 
        try { 
            FileReader reader = new FileReader("output.txt"); 
            int i; 
            while ((i = reader.read()) != -1) { 
                System.out.print((char) i); 
            } 
            reader.close(); 
        } catch (IOException e) { 
            System.out.println("An error occurred while reading the file."); 
        } 
    } 
}

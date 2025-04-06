import java.io.FileWriter; 
import java.io.IOException;   
public class filei { 
    public static void main(String[] args) { 
        try { 
            FileWriter writer = new FileWriter("output.txt"); 
            writer.write("Hello, this text is written to a file!"); 
            writer.close(); 
            System.out.println("Successfully written to the 
file."); 
        } catch (IOException e) { 
            System.out.println("An error occurred while 
writing to the file."); 
        } 
    } 
} 

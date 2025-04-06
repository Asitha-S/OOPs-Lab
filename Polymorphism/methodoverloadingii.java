class Display { 
 
    void show(String msg) { 
        System.out.println("Message: " + msg); 
    } 
  
    void show(String msg, int times) { 
        for (int i = 0; i < times; i++) { 
            System.out.println("Message " + (i + 1) + ": " + msg); 
        } 
    } 
  
    void show(int number) { 
        System.out.println("Number: " + number); 
    } 
} 
  
public class methodoverloadingii { 
    public static void main(String[] args) { 
        Display d = new Display(); 
  
        d.show("Hello"); 
        d.show("Java", 3); 
        d.show(2025); 
    } 
}

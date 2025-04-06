class Person { 
    String name = "John";  
 
  
    void display() { 
        System.out.println("Name: " + name); 
    } 
} 
  
class Student extends Person { 
    int rollNumber = 101;   
    void showDetails() { 
        display(); 
        System.out.println("Roll Number: " + 
rollNumber); 
    } 
} 
  
public class SingleInheritanceii { 
    public static void main(String[] args) { 
        Student s = new Student(); 
        s.showDetails(); 
    } 
} 

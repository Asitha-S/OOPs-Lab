abstract class Person { 
    String name;   
    Person(String name) { 
        this.name = name; 
        System.out.println("Person constructor called."); 
    }   
    abstract void display(); 
} 
  
class abstractclassiii extends Person { 
    Student(String name) { 
        super(name); 
    } 
  
    void display() { 
        System.out.println("Student name: " + name); 
    }   
    public static void main(String[] args) { 
        Student s = new Student("Arjun"); 
        s.display(); 
    } 
} 

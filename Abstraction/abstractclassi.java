abstract class Animal { 
    abstract void makeSound(); 
} 
  
class abstractclassi extends Animal { 
    void makeSound() { 
        System.out.println("Dog barks: Woof!"); 
    } 
  
    public static void main(String[] args) { 
        Dog d = new Dog(); 
        d.makeSound(); 
    } 
}

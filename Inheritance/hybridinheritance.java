interface A { 
    void methodA(); 
} 
  
interface B { 
    void methodB(); 
} 
  
class C { 
    void methodC() { 
        System.out.println("Inside class C: methodC()"); 
    } 
} 
  
class D extends C implements A, B { 
    public void methodA() { 
        System.out.println("Inside interface A: methodA()"); 
    } 
  
    public void methodB() { 
 
        System.out.println("Inside interface B: methodB()"); 
    } 
  
    void methodD() { 
        System.out.println("Inside class D: methodD()"); 
    } 
} 
  
public class hybridinheritance { 
    public static void main(String[] args) { 
        D obj = new D(); 
        obj.methodA(); 
        obj.methodB(); 
        obj.methodC(); 
        obj.methodD(); 
    } 
}

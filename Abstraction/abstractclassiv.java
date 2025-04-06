abstract void area(); } 
class Rectangle extends Shape { 
int length = 10, 
breadth = 5; 
void area() { 
    System.out.println("Area of Rectangle: " + (length * breadth)); 
} 
  
} 
class abstractclassiv extends Shape { int base = 10, height = 8; 
void area() { 
    System.out.println("Area of Triangle: " + (0.5 * base * height)); 
} 
 
public static void main(String[] args) { 
 
    Shape r = new Rectangle(); 
    Shape t = new Triangle(); 
 
    r.area(); 
    t.area(); 
}   
} 

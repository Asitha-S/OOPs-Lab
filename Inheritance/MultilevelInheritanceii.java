class Vehicle { 
    void type() { 
        System.out.println("This is a vehicle."); 
    } 
} 
  
class Car extends Vehicle { 

    void brand() { 
        System.out.println("Brand: Toyota"); 
    } 
} 
  
class SportsCar extends Car { 
    void topSpeed() { 
        System.out.println("Top Speed: 250 km/h"); 
    } 
} 
  
public class MultilevelInheritanceii { 
    public static void main(String[] args) { 
        SportsCar sc = new SportsCar(); 
        sc.type(); 
        sc.brand(); 
        sc.topSpeed(); 
    } 
} 

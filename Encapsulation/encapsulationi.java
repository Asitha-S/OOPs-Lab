class encapsulationi { 
    private String name; 
    private int age; 
  
    public void setName(String name) { 
        this.name = name; 
    } 
  
    public String getName() { 
        return name; 
    }   
    public void setAge(int age) { 
        this.age = age; 
    } 
  
    public int getAge() { 
        return age; 
    } 
  
    public static void main(String[] args) { 
        Student s = new Student(); 
        s.setName("Anjali"); 
        s.setAge(20); 
  
        System.out.println("Student Name: " + 
s.getName()); 
        System.out.println("Student Age: " + 
s.getAge()); 
    } 
} 

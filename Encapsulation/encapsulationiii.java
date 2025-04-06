class encapsulationiii { 
    private int id; 
    private String name; 
  
    public Employee(int id, String name) { 
        this.id = id; 
        this.name = name; 
    } 
  
    public int getId() { 
        return id; 
    } 
  
    public String getName() { 
 
        return name; 
    } 
  
    public static void main(String[] args) { 
        Employee e = new Employee(101, "Ravi"); 
        System.out.println("Employee ID: " + 
e.getId()); 
        System.out.println("Employee Name: " + 
e.getName()); 
    } 
}

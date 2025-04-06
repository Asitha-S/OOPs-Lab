class encapsulationiv { 
    private String title; 
    private String author; 
    private double price; 
  
    public void setTitle(String title) { 
        this.title = title; 
    } 

    public String getTitle() { 
        return title; 
    } 
  
    public void setAuthor(String author) { 
        this.author = author; 
    }   
    public String getAuthor() { 
        return author; 
    } 
  
    public void setPrice(double price) { 
        if (price >= 0) { 
            this.price = price; 
        } else { 
            System.out.println("Price cannot be 
negative!"); 
        } 
    } 
  
    public double getPrice() { 
        return price; 
    } 
  
    public static void main(String[] args) { 
        Book b = new Book(); 
        b.setTitle("Java Essentials"); 
        b.setAuthor("John Green"); 
        b.setPrice(499.99); 
  
        System.out.println("Book Title: " + 
b.getTitle()); 
        System.out.println("Author: " + b.getAuthor()); 
        System.out.println("Price: ₹" + b.getPrice()); 

    } 
} 

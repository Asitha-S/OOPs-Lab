interface Printable { 
    void print(); 
} 
  
class interfaceiv implements Printable { 
    public void print() { 
        System.out.println("Printing document: Java Lab 
Manual"); 
    } 
  
    public static void main(String[] args) { 
        Document d = new Document(); 
        d.print(); 
    } 
}

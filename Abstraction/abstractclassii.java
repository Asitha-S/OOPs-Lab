abstract class Bank { 
    abstract double getInterestRate(); 
  
    void bankName() { 
        System.out.println("Bank: State Bank of India"); 
    } 
} 
  
class abstractclassii extends Bank { 
    double getInterestRate() { 
        return 6.5; 
    } 
  
    public static void main(String[] args) { 
        SBI s = new SBI(); 
        s.bankName(); 
        System.out.println("Interest Rate: " + 
s.getInterestRate() + "%"); 
    } 
} 

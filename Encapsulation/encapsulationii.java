class encapsulationii { 
    private double balance; 
  
    public void setBalance(double amount) { 
        if (amount >= 0) { 
            balance = amount; 
        } else { 
            System.out.println("Invalid balance 
amount!"); 
        } 
    }   
    public double getBalance() { 
        return balance; 
    } 
  
    public static void main(String[] args) { 
        BankAccount acc = new BankAccount(); 
        acc.setBalance(15000); 

        System.out.println("Account Balance: ₹" + 
acc.getBalance()); 
  
        acc.setBalance(-2000); // This will trigger 
validation 
    } 
}

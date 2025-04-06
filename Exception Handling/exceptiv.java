class exceptiv { 
    public static void main(String[] args) { 
        try { 
            int a = 5 / 0; 
        } catch (ArithmeticException e) { 
            System.out.println("Caught exception: " + e); 
        } finally { 
            System.out.println("This block always executes."); 
        } 
    } 
}

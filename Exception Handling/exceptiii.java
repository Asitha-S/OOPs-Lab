class exceptiii { 
    public static void main(String[] args) { 
        try { 

            int a = 10 / 0;                
            int[] arr = new int[3]; 
            arr[4] = 5;                    
        } catch (ArithmeticException e) { 
            System.out.println("Error: Division by zero."); 
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Error: Invalid array index."); 
        } 
    } 
} 
 

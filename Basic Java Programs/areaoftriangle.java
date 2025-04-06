import java.util.Scanner;
public class areaoftriangle {
	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter the length of one side");
		Scanner length= new Scanner(System.in);
		a=length.nextInt();
		System.out.println("Enter the breadth");
		Scanner breadth= new Scanner(System.in);
		b=breadth.nextInt();
		int c=(a*b)/2;
		System.out.println("The area of the triangle is " + c);
}
}
 

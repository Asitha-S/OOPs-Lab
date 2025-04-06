//to check if two numbers are equal
import java.util.Scanner;
public class ifequal{
	public static void main(String[] args){
		int a,b;
		System.out.println("Enter a number:");
		Scanner num1=new Scanner(System.in);
		a=num1.nextInt();
		System.out.println("Enter a number:");
		Scanner num2=new Scanner(System.in);
		b=num2.nextInt();
		if (a==b){
			System.out.println("Numbers are equal");}
		else{
			System.out.println("Numbers are not equal");}
}
}

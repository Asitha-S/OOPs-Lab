import java.util.Scanner;
public class divisible{
	public static void main(String[] args){
		int a,b;
		System.out.println("Enter a number:");
		Scanner num1=new Scanner(System.in);
		a=num1.nextInt();
		System.out.println("Enter second number:");
		Scanner num2=new Scanner(System.in);
		b=num2.nextInt();
		if (a%b==0){
			System.out.println(a+" is divisible by "+b);}
		else{
			System.out.println(a+" is not divisible by "+b);}
}
}
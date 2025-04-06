import java.util.Scanner;
public class swaptwonum {
	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter a number:");
		Scanner num1=new Scanner(System.in);
		a=num1.nextInt();
		System.out.println("Enter a number:");
		Scanner num2=new Scanner(System.in);
		b=num2.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("The value of the a is "+a+ " and the value of the b is "+ b);
}
}

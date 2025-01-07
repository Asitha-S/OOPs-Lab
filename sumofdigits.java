import java.util.Scanner;
public class sumofdigits{
	public static void main(String[] args){
		int a,b,sum;
		sum=0;
		System.out.println("Enter a number:");
		Scanner num=new Scanner(System.in);
		a=num.nextInt();
		while(a>0){
			b=a%10;
			sum=sum+b;
			a=a/10;}
		System.out.println("Sum of digits is "+sum);}}
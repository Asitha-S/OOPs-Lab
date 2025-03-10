import java.util.Scanner;
public class checkprime{
	public static void main(String[] args){
		int a,n,i;
		System.out.println("Enter a number:");
		Scanner num=new Scanner(System.in);
		a=num.nextInt();
		n=0;
		for (i=2;i<a;i++){
			if (a%i==0){
				n++;}}
		if (n==0){
			System.out.println(a+" is a prime number");}
		else{
			System.out.println(a+" is not a prime number");}
}}
 

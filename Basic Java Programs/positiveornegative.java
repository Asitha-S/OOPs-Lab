import java.util.Scanner;
public class positiveornegative{
	public static void main(String[] args){
		int a;
		System.out.println("Enter a number:");
		Scanner num=new Scanner(System.in);
		a=num.nextInt();
		if (a>0){
			System.out.println("Number is positive");}
		else if (a<0){
			System.out.println("Number is negative");}
		else{
			System.out.println("Number is 0");}
}
}

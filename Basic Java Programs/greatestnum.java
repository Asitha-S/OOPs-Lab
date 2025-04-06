import java.util.Scanner;
public class greatestnum {
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter first number");
		Scanner sa=new Scanner(System.in);
		a=sa.nextInt();
		System.out.println("Enter first number");
		Scanner sb = new Scanner(System.in);
		b=sb.nextInt();
		System.out.println("Enter third number");
		Scanner sc=new Scanner(System.in);
		c=sc.nextInt();
		if (a>b){
			if(a>c){
				System.out.println(a+" is the greatest number");}
			else{
				System.out.println(c + " is the greatest number");}}
		else{
			if(b>c){
				System.out.println(b + " is the greatest number");}
			else{
				System.out.println(c + " is the greatest number");}}
}
}

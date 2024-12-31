import java.util.Scanner;
public class oddoreven {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number");
		Scanner n = new Scanner(System.in);
		num=n.nextInt();
		if (num%2==0){
			System.out.println(num + " is even");}
		else{
			System.out.println(num + " is odd");}
}
}

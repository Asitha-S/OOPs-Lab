import java.util.Scanner;
class fibonacciseries{
	public static void main(String[] args){
		System.out.println("Enter number of terms");
		Scanner s=new Scanner(System.in);
		int firstterm=0;
		int secondterm=1;
		int n=s.nextInt();
		for(int i=1; i<=n; i++){
			System.out.print(firstterm+" ");
			int nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;}
}
}
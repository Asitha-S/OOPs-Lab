import java.util.Scanner;

public class packagei {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Name: " + name );

        input.close();
    }
}

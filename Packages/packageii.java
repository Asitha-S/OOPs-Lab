import java.util.Random;
import java.time.LocalDate;
import java.lang.Math;

public class packageii {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100);
        System.out.println("Random number: " + num);

        double root = Math.sqrt(144);
        System.out.println("Square root of 144: " + root);

        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);
    }
}

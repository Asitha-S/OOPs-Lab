import java.util.HashMap;

public class packageiv {
    public static void main(String[] args) {
        packageiv<Integer, String> students = new packageiv<>();

        students.put(101, "Ravi");
        students.put(102, "Sneha");
        students.put(103, "Arjun");

        System.out.println("Student Roll Numbers: " + students);

        String name = students.get(102);
        System.out.println("Name of student with roll 102: " + name);
    }
}

import java.util.Scanner;
import java.util.ArrayList;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        System.out.println("Enter the name of a person");
        String name = keyboard.nextLine();
        while (!name.isEmpty()) {
            names.add(name);
            System.out.println("Enter the age of the person");
            int age = keyboard.nextInt();
            ages.add(age);
            keyboard.nextLine(); // Consume the newline left-over
            System.out.println("Enter the name of a person (or press Enter to finish):");
            name = keyboard.nextLine();
        }

        // Printing the names and ages
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " is " + ages.get(i) + " years old.");
        }

        keyboard.close();
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayList {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<Double>();
        double input;

        System.out.println("Enter a non negative number to add to the list" + "\n" + "Enter a negative number to exit");
        input = keyboard.nextDouble();
        while(input >= 0){
            numbers.add(input);
            System.out.println("Enter a non negative number to add to the list" + "\n" + "Enter a negative number to exit");
            input = keyboard.nextDouble();
        }

        System.out.println("The numbers in the list in the reverse order of number entered is:");
        for(int i = numbers.size() -1; i >= 0; i--){
            System.out.println(numbers.get(i));
        }
        System.out.println("Goodbye");
        keyboard.close();

    }//end main
}
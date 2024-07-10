import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        System.out.println("Enter a number: ");
        number = keyboard.nextInt();
        if (number % 3 == 0) {
            System.out.println("The entered number: " + number + " is divisible by 3");
        }
        else {
            System.out.println("The entered number: " + number + " is not divisible by 3");
        }
        keyboard.close();
    }
}

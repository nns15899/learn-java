import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter an integer: ");
        System.out.println("Enter a negative number to exit: ");
        number = keyboard.nextInt();
        while (number > 0) {
            sum += number;
            System.out.println("The sum is: " + sum);
            System.out.print("Enter another integer: ");
            number = keyboard.nextInt();

        }
        keyboard.close();
        System.out.println("You entered negative number!");
    }
}

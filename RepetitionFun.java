import java.util.Scanner;

public class RepetitionFun {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int input;

        System.out.println("Enter a number");
        System.out.print("a negative number to exit :");

        input = keyboard.nextInt();
        while (input >=0 ) {
            System.out.println(input);
            input = keyboard.nextInt();

            System.out.println("Enter a number");
            System.out.println("a negative number to exit");
        }

        System.out.println("Goodbye");
    }//end main

}

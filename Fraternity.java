import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        String gender;

        System.out.print("Enter your age:\t");
        age = keyboard.nextInt();

        System.out.print("Enter your gender (M/F):\t");
        gender = keyboard.next();

        if(age >=19 && gender.equalsIgnoreCase("Male")) {
            System.out.println("You are eligible to join the fraternity.");
        } else {
            System.out.println("You are not eligible to join the fraternity.");
        }

        keyboard.close();

    }//end main
}
import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int baseCost;
        int includeCourse;
        int whichPackage;
        int totalCost;
        int additionalCost;
        int purchasedCourse;

        System.out.print("Enter the package 1, 2 or 3: ");
        whichPackage = keyboard.nextInt();

        System.out.println("Enter the number of courses purchased: ");
        purchasedCourse = keyboard.nextInt();

        if (whichPackage == 1) {
            baseCost = 10;
            includeCourse = 2;
            additionalCost = 6;
        }
        else if (whichPackage == 2) {
            baseCost = 12;
            includeCourse = 4;
            additionalCost = 4;
        }
        else {
            baseCost = 15;
            includeCourse = 6;
            additionalCost = 3;
        }

        if (purchasedCourse > includeCourse) {
            totalCost = baseCost + (purchasedCourse - includeCourse) * additionalCost;
            System.out.println("The total cost is: " + totalCost);
        }
        else {
            System.out.println("The total cost is: " + baseCost);
        }

    }
}
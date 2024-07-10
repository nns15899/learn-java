import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i< 10; i++) {
            int roll = rand.nextInt(6) + 1 ;//random number bw 1 and 6
            System.out.println("Roll: " + (i+1) + " Value: " + roll);
        }
    }
}

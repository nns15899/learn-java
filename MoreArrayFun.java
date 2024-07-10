public class MoreArrayFun {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println("\nThe numbers with enhanced for loop:");
        for (int i: numbers) {
            System.out.println(i);
        }
    }
}

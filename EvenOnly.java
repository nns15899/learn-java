public class EvenOnly {
    public static void main(String[] args) {
//        for (int number=0; number<50; number++) {
//            if (number % 2 != 0) {
//                continue;
//            }
//            System.out.println(number);
//        }
        int count = 0;
        while (count < 50){
            if (count % 2 != 0) {
                count++;
                continue;
            }
            System.out.println(count);
            count++;
        }
    }
}

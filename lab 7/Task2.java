import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] B = new int[15];
        Random rand = new Random();
        int sum = 0;

        System.out.println("Массив элементтері:");
        for (int i = 0; i < B.length; i++) {
            B[i] = rand.nextInt(41) - 20;
            System.out.print(B[i] + " ");
            if (B[i] > 0) {
                sum += B[i];
            }
        }

        System.out.println("\nОң элементтер қосындысы: " + sum);
    }
}
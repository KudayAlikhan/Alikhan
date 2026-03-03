import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] A = new int[20];
        Random rand = new Random();
        int sum = 0;

        System.out.println("Массив элементтері:");
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(41) - 20; // -20..20
            System.out.print(A[i] + " ");
            if (A[i] < 0) {
                sum += A[i];
            }
        }

        System.out.println("\nТеріс элементтер қосындысы: " + sum);
    }
}
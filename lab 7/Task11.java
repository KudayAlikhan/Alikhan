import java.util.Random;
import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] A = new int[25];
        Random rand = new Random();

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(100);
        }

        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[minIndex]) minIndex = i;
            if (A[i] > A[maxIndex]) maxIndex = i;
        }

        int temp = A[minIndex];
        A[minIndex] = A[maxIndex];
        A[maxIndex] = temp;

        System.out.println("Ауыстырылған массив:");
        System.out.println(Arrays.toString(A));
    }
}
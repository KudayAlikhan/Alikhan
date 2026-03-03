import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        int[][] A = new int[10][10];
        int[] B = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                A[i][j] = rand.nextInt(41) - 20;
                if (A[i][j] < 0) B[i] += A[i][j];
            }
        }

        System.out.println(Arrays.toString(B));
    }
}
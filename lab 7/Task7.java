import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        double[][] B = new double[5][5];
        double[] A = new double[5];
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                B[i][j] = rand.nextDouble() * 20 - 10;
                if (B[i][j] > 0) A[i] += B[i][j];
            }
        }

        System.out.println(Arrays.toString(A));
    }
}
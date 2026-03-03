import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        double[][] A = new double[12][6];
        double[] result = new double[6];
        Arrays.fill(result, 1);
        Random rand = new Random();

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = rand.nextDouble() * 20 - 10;
                if (A[i][j] < 0) result[j] *= A[i][j];
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int[][] C = new int[5][5];
        Random rand = new Random();
        int product = 1;

        for (int i = 0; i < 5; i++) {
            C[i][i] = rand.nextInt(20);
            if (C[i][i] > 0) product *= C[i][i];
        }

        System.out.println("Көбейтінді: " + product);
    }
}
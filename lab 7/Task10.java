import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        double[][] D = new double[7][7];
        Random rand = new Random();
        double sum = 0;

        for (int i = 0; i < 7; i++) {
            D[i][i] = rand.nextDouble() * 50;
            sum += D[i][i];
        }

        System.out.println("Орташа мән: " + sum / 7);
    }
}
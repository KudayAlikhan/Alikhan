import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        double[] D = new double[17];
        Random rand = new Random();
        double sum = 0;

        for (int i = 0; i < D.length; i++) {
            D[i] = rand.nextDouble() * 100;
            sum += D[i];
        }

        System.out.println("Арифметикалық орта: " + sum / D.length);
    }
}
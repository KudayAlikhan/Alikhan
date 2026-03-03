import java.util.Random;
import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] B = new int[25];
        Random rand = new Random();

        for (int i = 0; i < B.length; i++) {
            B[i] = rand.nextInt(100);
        }

        Arrays.sort(B);

        System.out.println("Өсу ретімен:");
        System.out.println(Arrays.toString(B));
    }
}
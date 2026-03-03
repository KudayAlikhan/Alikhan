import java.util.Random;

public class Task16 {

    public static int maxX() {
        int[] array = new int[10];
        Random rand = new Random();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Максималды элемент: " + maxX());
    }
}
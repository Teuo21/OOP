import java.util.Random;
public class RandArray {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int maxEvenStreak = 0;
        int currentStreak = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                currentStreak++;
                if (currentStreak > maxEvenStreak) {
                    maxEvenStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }

        int maxDiff = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int diff = Math.abs(array[i] - array[i + 1]);
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        System.out.println("Max even streak: " + maxEvenStreak);
        System.out.println("Max diff: " + maxDiff);
    }
}

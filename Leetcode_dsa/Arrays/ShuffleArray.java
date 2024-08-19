package Arrays;
import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] b = shuffleArray(a);

        System.out.println("Original array: " + Arrays.toString(a));
        System.out.println("Shuffled array: " + Arrays.toString(b));
    }

    public static int[] shuffleArray(int[] a) {
        int n = a.length / 2;
        int[] b = new int[a.length];
        
        for (int i = 0; i < n; i++) {
            b[2 * i] = a[i];
            b[2 * i + 1] = a[i + n];
        }
        
        return b;
    }
}


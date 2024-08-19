package Arrays;

import java.util.Arrays;

public class GreatestCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        boolean[] result = kidsWithCandies(candies, extraCandies);

        System.out.println("Output: " + Arrays.toString(result));
    }

    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;

        // Find the maximum number of candies any kid currently has
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        // Determine if each kid can have the greatest number of candies with extraCandies
        boolean[] result = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            result[i] = candies[i] + extraCandies >= maxCandies;
        }

        return result;
    }
}

package Searching;

import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Input array elements
        int[] numbers = new int[n];
        System.out.println("Enter the sorted elements of the array: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Input target value
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        
        // Find and print the result
        int[] result = twoSum(numbers, target);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found!");
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;  // Start index
        int right = numbers.length - 1;  // End index
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                // Return the 1-based indices
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;  // Need a larger sum
            } else {
                right--;  // Need a smaller sum
            }
        }
        // The problem guarantees one solution, so we should not reach here
        return null;  // Return null if no solution is found (shouldn't happen with valid input)
    }
}

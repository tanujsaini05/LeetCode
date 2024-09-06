package Searching;
import java.util.Scanner;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (nums[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (nums[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Target is not found
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initializing the array
        int[] nums = new int[size];

        // Taking array elements input (Assumed to be in ascending order)
        System.out.println("Enter " + size + " sorted elements of the array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // Taking target input
        System.out.print("Enter the target value to search: ");
        int target = scanner.nextInt();

        // Performing binary search
        int result = search(nums, target);

        // Output the result
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }

        scanner.close();
    }
}

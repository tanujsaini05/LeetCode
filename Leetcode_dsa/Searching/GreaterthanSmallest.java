package Searching;

public class GreaterthanSmallest {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'}; // Example array
        char target = 'a'; // Example target
        
        char result = nextGreatestLetter(letters, target);
        System.out.println("The smallest character greater than '" + target + "' is: " + result);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (letters[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        // If no element is greater than the target, wrap around to the first element
        return letters[left % letters.length];
    }
    
}

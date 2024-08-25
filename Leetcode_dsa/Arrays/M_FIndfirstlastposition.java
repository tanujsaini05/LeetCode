package Arrays;


class M_FIndfirstlastposition {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirstPosition(nums, target);
        result[1] = findLastPosition(nums, target);
        return result;
    }

    private int findFirstPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstPosition = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                firstPosition = mid;
                right = mid - 1; // Keep searching in the left half
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return firstPosition;
    }

    private int findLastPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lastPosition = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                lastPosition = mid;
                left = mid + 1; // Keep searching in the right half
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return lastPosition;
    }
    public static void main(String[] args) {
        M_FIndfirstlastposition solution = new M_FIndfirstlastposition();
        
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = solution.searchRange(nums, target);
        System.out.println("First and last positions of target " + target + ": [" + result[0] + ", " + result[1] + "]");

        target = 6;
        result = solution.searchRange(nums, target);
        System.out.println("First and last positions of target " + target + ": [" + result[0] + ", " + result[1] + "]");

        target = 10;
        result = solution.searchRange(nums, target);
        System.out.println("First and last positions of target " + target + ": [" + result[0] + ", " + result[1] + "]");
    }
}

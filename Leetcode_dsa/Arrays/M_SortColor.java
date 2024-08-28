package Arrays;

public class M_SortColor {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void sortColors(int[] nums) {
                int low = 0; 
                int mid = 0; 
                int high = nums.length - 1;
        
                while (mid <= high) {
                    if (nums[mid] == 0) {
                        // Swap nums[low] and nums[mid]
                        int temp = nums[low];
                        nums[low] = nums[mid];
                        nums[mid] = temp;
                        low++;
                        mid++;
                    } else if (nums[mid] == 1) {
                        mid++;
                    } else {
                        // Swap nums[mid] and nums[high]
                        int temp = nums[mid];
                        nums[mid] = nums[high];
                        nums[high] = temp;
                        high--;
                    }
                }
            }
}


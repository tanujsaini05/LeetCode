package Arrays;
import java.util.*;

public class M_RotateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length ::");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements ::");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        rotate(arr);
        //System.out.print(rotate(arr));
        in.close();
    }
    public static void rotate(int[] nums){
        int n = nums.length;
        int first = nums[0];
        for(int i = 1; i < n; i++){
            nums[i-1] = nums[i];
        }
        nums[n-1] = first;
        System.out.println("Rotated array"+Arrays.toString(nums));
    }
}

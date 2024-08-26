package Arrays;
import java.util.Scanner;
//import java.util.*;
public class M_jumpGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the elements of array :: ");
        for (int i=0; i<n; i++){
            nums[i] = in.nextInt();
        }
        System.out.println(jump(nums));
        in.close();
    }
    public static boolean jump(int[] nums){
        int n = nums.length;
        int reach = 0;
        for (int i = 0; i < n; ++i) {
            if (reach < i){
                return false;
            }
            reach =  Math.max(reach,i+nums[i]);
        }
        return true;
    }
}

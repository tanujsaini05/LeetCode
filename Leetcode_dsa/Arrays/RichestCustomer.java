package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class RichestCustomer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of customers :: ");
        int n = in.nextInt();
        System.out.print("Enter the number of bank statements :: ");
        int k = in.nextInt();
        int[][] arr = new int[n][];
        for (int i = 0; i<n ; i++){
            //System.out.print("Enter the amount of customer "+(i+1)+" :: ");
            arr[i] = new int[k];
            for (int j=0;j<k;j++){
                System.out.print("Enter the "+(i+1)+"th customer's"+(j+1)+"th statement :: ");
                arr[i][j] = in.nextInt();
            }

        }
        int Balance = 0; 
        int cust=0;
        for (int i = 0; i < arr.length; i++) {
            if (Balance<sumA(arr[i])){
                Balance = sumA(arr[i]);
                cust = i+1;
            }
        }
        System.out.println(Arrays.deepToString(arr));

        System.out.println(cust+" is the richest customer.");
        in.close();
    }
    public static int sumA(int[] num){
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }
}

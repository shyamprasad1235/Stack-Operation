import java.util.Scanner;
import java.util.Arrays;
public class Kth_Smallest {
    public static void main(String args[]){
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K value:");
        int k = sc.nextInt();
        Arrays.sort(arr);
        int Value;
        Value = arr[k-1];
        System.out.println("The kth Smallest number is :" +Value);

    }
    
}

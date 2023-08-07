import java.util.Scanner;

public class ArrayRotation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("The Rotated Value: ");
        k = k % n; // To handle k values greater than n

        for (int i = 0; i < n; i++) {
            if (i < k)
                System.out.println(array[n - k + i]);
            else
                System.out.println(array[i - k]);
        }
    }
}

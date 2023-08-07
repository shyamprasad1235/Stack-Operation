import java.io.*;
import java.util.Scanner;
public class Search{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Total number of elements");
        int n =sc.nextInt();
        System.out.println("Enter the value to be searched:");
        int k =sc.nextInt();
        int array[] = new int[n];

        for(int i=0;i<n;i++)
        {
            array[i] = sc.nextInt();
            for (i=0;i<n;i++)
            {
                if (array[i] == k)
                {
                    System.out.println(i);
                    break;
                }
                else
                {
                    System.out.println("Element not found");
                }
            }

        }
        
    }
}
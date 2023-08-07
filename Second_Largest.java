import java.util.Scanner;
import java.util.Arrays;

import javax.lang.model.element.Element;
public class Second_Largest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elements of Array:");
        int n = sc.nextInt();
        int array[] = new int[n];
        int largest = 0;
        int Second_Largest = 0;
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
            if(array[i]>largest){
                Second_Largest = largest;
                largest = array[i];
            }
            else if (array[i]>Second_Largest && array[i]!=largest){
                Second_Largest = array[i];
            }
           
        }
        //int index = Arrays.binarySearch(array, Second_Largest);
        System.out.println("The Second Largest Number is :" + Second_Largest);
        //System.out.println("The Index is : " + findIndex(array [i],Second_Largest));
        //System.out.println("Location:" + index);

    }
    
}

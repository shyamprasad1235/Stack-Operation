import java.util.Scanner;
public class GreaterNo {
    public static void main(String args[]){
        int max = 0;
        Scanner sc = new Scanner(System.in);
        int array[] = new int[8];
        for(int n=0;n<8;n++){
            array[n] = sc.nextInt();

            if(array[n]>max)
            max = array[n];
        }
        System.out.println("The largest No:" + max);
        
    
        
        
    }
    
}

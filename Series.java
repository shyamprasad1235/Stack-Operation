import java.util.*;
public class Series {
    public static void main(String args[]){
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(a+" "+b+" ");
        for(int i=0;i<n;i++){
            a=a+7;
            b=b+6;
            System.out.println(a+" "+b+" ");

        }
        /*int a=7, b=0, c;
        for(int i=0;i<8;i++){
            c=a*b;
            System.out.println(c+" "+(c-b)+" ");
            b++;
        }*/
    }
    
}

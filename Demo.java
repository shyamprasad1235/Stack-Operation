import java.util.Scanner;
public class Demo {
    public static void main(String args[]) 
    {
        int i, j;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(i=2;i<=n;i++)
        {
            boolean isPrime = true;
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0){
                    isPrime =false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
        
    }
    
}

import java.util.*;
import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String A = sc.nextLine();
        if(isPalindrome(A)){
            System.out.println(A+" is a Palindrome");
        }
        else
        {
            System.out.println(A+" is not a Palindrome");
        }        
    }
    public static boolean isPalindrome(String A)
    {
        int i=0, j=A.length() -1;
        while (i<j)
        {
            if(A.charAt(i)!=A.charAt(j))
                return false;
                i++;
                j--;
        }
        return true;
        
        
    }

}

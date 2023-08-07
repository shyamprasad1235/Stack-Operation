import java.util.*;

import javax.swing.text.html.parser.Element;


class Operations {
    int size;
    int maxSize = size;
    int top = -1;
    int[] StackArray;
    //StackArray = new int[maxSize];
    public void push(int item){
        if (top == maxSize-1){
          System.out.println("Stack is Full");
          return;  
        }
        top = top+1;
        StackArray[top] = item;
        System.out.println("Pushed Element" +item);
    }
    public void pop(){
        if (top == -1){
            System.out.println("Stack is Empty");
            return;
        }
        top = top-1;
        int item = StackArray[top];
        System.out.println("popes Element" +item);
    }
    public class Stack{
         public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of stack:");
            int maxSize = sc.nextInt();
            Operations stack = new Operations(maxSize);

            int choice;           
            System.out.println("/nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

             switch(choice)
             {
                case 1:
                System.out.println("Enter the elements to be pushed: ");
                int element = sc.nextInt();
                stack.push(element);
                break;

                case 2:
                int poppedElement = stack.pop();
                System.out.println("PoppedElement:"+ poppedElement);
                break;
            }
        }
    }  
}    
    
   
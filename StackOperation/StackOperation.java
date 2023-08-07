import java.util.Scanner;

class StackOperation {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public StackOperation(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is Full");
            return;
        }
        top = top + 1;
        stackArray[top] = value;
        System.out.println("Pushed Element: " + value);
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int value = stackArray[top];
        top = top - 1;
        System.out.println("Popped Element: " + value);
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum size of stack:");
        int maxSize = sc.nextInt();
        StackOperation stack = new StackOperation(maxSize);

        int choice;
        do {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("Enter your Choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to push:");
                    int element = sc.nextInt();
                    stack.push(element);
                    break;

                case 2:
                    int poppedElement = stack.pop();
                    if (poppedElement != -1) {
                        System.out.println("Popped Element: " + poppedElement);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        } while (choice == 1 || choice == 2);

        sc.close();
    }
}

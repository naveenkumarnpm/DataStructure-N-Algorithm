import java.util.Scanner;


public class Stack {
    int arr[]=new int[5];
    int top=-1;


    public int push(int n)
    {
        top++;
        if(top==arr.length-1) System.out.println("stack is full");
        arr[top]=n;
        return n;
    }

    public int pop()
    {
        int n=arr[top];
        top--;
        return n;
    }

    public void display()
    {
        for(int i=0;i<top;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Stack s=new Stack();
        Scanner scanner=new Scanner(System.in);
        int userInput=0;

        while (true) {
            System.out.println("Enter an option:");
            System.out.println("0 - Insert element");
            System.out.println("1 - Exit");
            System.out.println("2 - Delete element");
            System.out.println("3 - Display elements");
            userInput = scanner.nextInt();

            switch (userInput) {
                case 0:
                    System.out.println("Enter Element to Insert");
                    int ele=scanner.nextInt();
                    int n=s.push(ele);

                    System.out.println("Insert element");
                    break;
                case 1:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                case 2:
                    // Code to delete element from stack
                    int r=s.pop();
                    System.out.println("deleted elements "+r);
                    System.out.println("Delete element");
                    break;
                case 3:
                    // Code to display elements in stack
                    s.display();
                    System.out.println("Display elements");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        


    }
}

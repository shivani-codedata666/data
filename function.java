import java.util.Scanner;

public class function {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    arithmetic(scanner);
    swapnumber(scanner);
    reversenumber(scanner);
    palidrome(scanner);


}

    public static void arithmetic(Scanner scanner) {

        System.out.print("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Addition" + (num1 + num2));
        System.out.println("Subtraction" + (num1 - num2));
        System.out.println("Multiplication" + (num1 * num2));
        if (num2 != 0) {
            System.out.println("division:" + (num1 / num2));
        } else {
            System.out.println("cannot divide by zero.");
        }
    }

    public static void swapnumber(Scanner scanner) {
        System.out.println("enter the first number:");
        int num1 = scanner.nextInt();
        System.out.print("enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping:");
        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);
    }


    public static void reversenumber(Scanner scanner) {
        System.out.println("enter a number:");
        int num = scanner.nextInt();
        int reversenum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversenum = reversenum * 10 + digit;
            num /= 10;
        }
        System.out.println("reversed number" + reversenum);
    }

    public static void palidrome(Scanner scanner) {
        System.out.println("enter a number:");
        int num = scanner.nextInt();
        int originalnum = num;
        int reversenum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversenum = reversenum * 10 + digit;
            num /= 10;
        }
        if (originalnum == reversenum) {
            System.out.println("the number is palidrome.");
        } else {
            System.out.println("the number is not palidrome");


        }
    }
}



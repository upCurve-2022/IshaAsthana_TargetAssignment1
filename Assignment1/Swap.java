package Assignment1;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        // a) Program to swap two numbers:
        // b) Program to swap three numbers:
        // Using if statements:
        int n, a, b, c, temp = 0, temp1 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Numbers to be swapped (2 or 3) : ");
        n = input.nextInt();
        if (n == 2) {
            System.out.println("Enter first number (a): ");
            a = input.nextInt();
            System.out.println("Enter the second number (b): ");
            b = input.nextInt();
            // swapping
            temp = a;
            a = b;
            b = temp;
            System.out.println("After swapping, values of a & b: " + "\n a=" + a + "\n b=" + " " + b);
        } else {
            System.out.println("Enter a:");
            a = input.nextInt();
            System.out.println("Enter b:");
            b = input.nextInt();
            System.out.println("Enter c:");
            c = input.nextInt();
            temp = a;
            a = b;
            b = c;
            c = temp;
            System.out.println("Swapped values of a,b and c:" + "\n a = " + a + "\n b = " + b + "\n c = " + c);
        }
    }
}

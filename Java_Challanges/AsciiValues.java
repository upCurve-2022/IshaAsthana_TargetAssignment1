package Java_Challanges;

import java.util.Scanner;

public class AsciiValues {
    public static void main(String[] args) {
        char a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character : ");
        a = sc.next().charAt(0);
        System.out.println("ASCII value of " + a + " is : " +(int)a);
    }
}

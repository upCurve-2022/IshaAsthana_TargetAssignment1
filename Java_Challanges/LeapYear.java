package Java_Challanges;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        float a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to be checked : ");
        a = sc.nextInt();
        if(a%4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0)
                    System.out.println(a + " is a leap year.");
                else
                    System.out.println(a + " is not a leap year!");
            }
            else
                System.out.println(a + " is a leap year.");
        }
        else
            System.out.println(a + " is not a leap year!");
    }
}

package Java_Challanges;

import java.util.Scanner;

public class LargestUsingTernaryOperator {
    public static void main(String[] args){
        int a,b,c;
        int largest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        a = sc.nextInt();
        System.out.println("Enter the second number : ");
        b = sc.nextInt();
        System.out.println("Enter the third number : ");
        c = sc.nextInt();
        largest = (a>b)&&(a>c)?a:(b>a)&&(b>c)?b:(c>a)&&(c>b)?c:0;
        System.out.println("Largest among " + a + " " + b + " " + c + " is : " + largest);
    }
}

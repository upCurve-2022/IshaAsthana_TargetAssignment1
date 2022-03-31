package Assignment1;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three digit number : ");
        n = sc.nextInt();
        int m=n;
        for(int i=0;i<3;i++){
            int k = n%10;
            sum += Math.pow((double)k,3.0);
            n=n/10;
        }
        if(sum==m)
            System.out.println("Its an armstrong number.");
        else
            System.out.println("Its not an armstrong!");
    }
}

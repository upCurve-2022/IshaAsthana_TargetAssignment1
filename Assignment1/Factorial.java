package Assignment1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n,m=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number : ");
        n = sc.nextInt();
        for(int i=n;i>0;i--){
            m *= i;
        }
        System.out.println("Factorial of "+n+ " = " + m);
    }

}

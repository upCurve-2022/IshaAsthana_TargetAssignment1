package Assignment1;

import java.util.Scanner;

public class ToThePower {
    public static void main(String[] args) {
        int a,n,k=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be powered : ");
        a = sc.nextInt();
        System.out.println("Enter the power : ");
        n = sc.nextInt();
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            b[i] = a;
        }
        for(int j=0;j<n;j++){
            k*=b[j];
        }
        System.out.println(k);
    }
}

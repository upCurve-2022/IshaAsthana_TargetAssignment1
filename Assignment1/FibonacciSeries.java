package Assignment1;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        n = sc.nextInt();
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 1;
        for(int i=2;i<n;i++){
            a[i] = a[i-1] + a[i-2];
        }
        for(int j=0;j<n;j++){
            System.out.print(a[j] + " ");
        }
    }
}

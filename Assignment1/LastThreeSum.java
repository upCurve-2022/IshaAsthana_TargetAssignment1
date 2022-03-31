package Assignment1;

import java.util.Scanner;

public class LastThreeSum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        n = sc.nextInt();
        int[] a = new int[n];
        a[0]=1;
        a[1] = 4;
        a[2] = 7;
        for(int j=0;j<3;j++){
            System.out.print(a[j] + " ");
        }
        for(int i=3;i<a.length;i++){
            a[i] = a[i-3]+a[i-2]+a[i-1];
            System.out.print(a[i] + " ");

        }

    }
}

package Assignment1;

import java.util.Scanner;

public class SeriesNew {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            if(i%2 == 0)
                arr[i] = 3;
            else
                arr[i] = 4;
        }
        int[] a = new int[n];
        a[0] = 3;
        for(int j=1;j<n;j++){
            a[j] = arr[j-1] + a[j-1];
        }
        int[] b = new int[n];
        b[0] = 1;
        for(int k=1;k<n;k++){
            b[k] = a[k-1] - b[k-1];
        }
        for(int l=0;l<n;l++){
            if(l%2==0)
                System.out.print(b[l] + " ");
            else
                System.out.print("-" + b[l] + " ");
        }
    }
}

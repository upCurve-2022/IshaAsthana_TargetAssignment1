package Assignment1;

import java.util.Scanner;

public class SquareSeries {
    public static void main(String[] args) {
        int a=1,b,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=1;i<n;i++){
            int k = i;
            arr[i] = k*k;
        }
        int[] series = new int[n];
        series[0] = a;
        for(int j=1;j<n;j++){
            series[j] = arr[j] + series[j-1];
        }
        for(int l=0;l<n;l++){
            int m=l;
            if(m%2 == 0)
                System.out.print(series[l] + " ");
            else
                System.out.print("-" + series[l] + " ");
        }
    }
}

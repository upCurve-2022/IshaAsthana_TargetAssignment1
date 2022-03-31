package Assignment1;

import java.util.Scanner;

public class DifferenceSeries {
    public static void main(String[] args) {
        int n,k=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        n = sc.nextInt();
        int[]a = new int[n];
        int[]b = new int[n];
        int[]c = new int[n];
        for(int j=0;j<n;j+=2) {
            a[j] = k + 4;
        }
        for(int j=1;j<n;j+=2){
            a[j] = k+8;
        }
        k=0;
        for(int l=0;l<n;l++){
            if(l==0)
                b[l]=a[l];
            else if(l==1)
                b[l] = a[l];
            else{
                k=l-1;
                b[l] = a[k]+b[k];
            }
        }
        for(int m=0;m<n;m++){
            if(m==0)
                c[m] = 1;
            else{
                k=m-1;
                c[m] = b[k]+c[k];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(c[i] + " ");
        }
    }
}

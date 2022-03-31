package Assignment1;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n,i,k=0;
//        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        n = sc.nextInt();
        i=n;
        while(i>0){
            //int b=i%2;
            i=i/2;
            k++;
        }
        i=n;
        int[] a = new int[k];
        int j=0;
        while(i>0){
            int b=i%2;
            i = i/2;
            a[j]=b;
            j++;
        }

        for(int p=k-1;p>=0;--p){
            System.out.print(a[p] + " ");
        }
    }
}

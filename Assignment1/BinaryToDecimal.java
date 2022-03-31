package Assignment1;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        n = sc.nextInt();
        int s=n;
        int i=0;
        while(n!=0){
            n=n/10;
            i++;
        }
        n=s;
        int[] a = new int[i];
        for(int j=0;j<a.length;j++){
            a[j] = n%10;
            n=n/10;
        }
        int decimal=0;
        for(int k=0;k<a.length;k++){
            decimal += a[k]*(Math.pow(2.0,(double)k));
        }
        System.out.println(decimal);

    }
}

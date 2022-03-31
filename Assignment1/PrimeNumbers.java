package Assignment1;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n,m;
        boolean k;
        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        n = sc.nextInt();
        System.out.println("m = ");
        m = sc.nextInt();
        for(int i=n;i<m+1;i++){
            k=prime(i);
            if(k) System.out.print(i + " ");
        }
    }
    public static boolean prime(int a){
        int count=0;
        for(int i=1;i<a+1;i++){
            if(a%i == 0) count++;
        }
        if(count==2) return true;
        else return false;
    }
}

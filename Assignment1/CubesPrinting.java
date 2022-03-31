package Assignment1;

import java.util.Scanner;

public class CubesPrinting {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        n = sc.nextInt();
        for(int i=1;i<n+1;i++){
            System.out.print((int)Math.pow(i,i) + " ");
        }

    }
}

package Assignment1;

import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args) {
        int n,k;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        n = in.nextInt();
        for(int i=0;i<n+1;i++){
            for(k=0;k<(n+1)-i;k++) {
                System.out.print(" ");
            }
            for(int j=(n+1)-i;j<(n+1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

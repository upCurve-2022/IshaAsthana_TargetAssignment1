package Assignment1;

import java.util.Scanner;

public class EvenSquareSeriesSum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        n = sc.nextInt();
        for(int i=2;i<n+1;i++){
            if(i%2==0)
                System.out.print(i*i + " ");
        }
    }
}

package Assignment1;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        int n,even=0,odd=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        n = in.nextInt();
        for(int i=0;i<n+1;i++){
            if(i%2 == 0){
                even +=i;
            }
            else
                odd +=i;
        }
        System.out.println("Even Sum = " + even);
        System.out.println("Odd sum = " + odd);
    }
}

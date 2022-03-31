package Assignment1;

import java.util.Scanner;

public class SeparateWholeAndFractionNumbers {
    public static void main(String[] args) {
        double a;
        int b,i=10;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any decimal number : ");
        a = in.nextDouble();
        b = (int)a;
        System.out.print(b + " ");
        float d = (float)(a - b);
        while(i!=0){
            double c=d*i;
            if(c-(int)c == 0.0){
                System.out.print((int)c);
                break;
            }
            else{
                i = i*10;
            }
        }
    }
}

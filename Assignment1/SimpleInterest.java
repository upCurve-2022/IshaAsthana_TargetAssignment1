package Assignment1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        double p=0,r=0,t=0,SI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount invested : ");
        p = sc.nextDouble();
        System.out.println("Enter the rate per annum : ");
        r = sc.nextDouble();
        System.out.println("Enter the time in years : ");
        t = sc.nextDouble();
        SI = (p*r*t)/100;
        System.out.println("Simple interest = " + SI);
    }
}

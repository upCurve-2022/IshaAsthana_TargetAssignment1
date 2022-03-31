package Assignment1;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int a,b,c,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        a = sc.nextInt();
        System.out.println("Enter b : ");
        b = sc.nextInt();
        System.out.println("Enter c : ");
        c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("Largest : " + a);
            temp = a;
        }
        else if(b>a && b>c){
            System.out.println("Largest : " + b);
            temp = b;
        }
        else{
            System.out.println("Largest : " + c);
            temp = c;
        }
        if(temp==a){
            if(b<c)
                System.out.println("Second Largest : " + c);
            else
                System.out.println("Second Largest : " + b);
        }
        else if(temp==b){
            if(a<c)
                System.out.println("Second Largest : " + c);
            else
                System.out.println("Second Largest : " + a);
        }
        else{
            if(a<b)
                System.out.println("Second Largest : " + b);
            else
                System.out.println("Second Largest : " + a);
        }
    }
}

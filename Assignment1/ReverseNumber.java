package Assignment1;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        long a,val,rev = 0,b,d;
        int i=10,size=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed : ");
        a = sc.nextLong();
        d=a;
        while(a!=0){
            val = a%10;
            rev = val + (rev*10);
            b = a/10;
            a = b;
        }
        while(d!=0){
            if(d%10 == 0){
                System.out.print(0);
                d=d/10;
            }
            else
                break;
        }
        System.out.print(rev);
    }
}

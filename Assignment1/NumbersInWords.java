package Assignment1;

import java.util.Scanner;

public class NumbersInWords {
    static String []num = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    public static void main(String[] args) {
        int a, k, b,c=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        a = sc.nextInt();
        b = reverse(a);
        k=b;
        while(k!=0){
            c=k%10;
            System.out.print(num[c] + " ");
            k=k/10;
        }
        while(a!=0){
            if(a%10 == 0){
                System.out.print("zero ");
                a=a/10;
            }
            else
                break;
        }
    }
    public static int reverse(int a){
        int val,rev=0,b,d=a;
        while(a!=0){
            val = a%10;
            rev = val + (rev*10);
            b=a/10;
            a=b;
        }
        while(a!=0){
            if(a%10 == 0){
                System.out.println(num[a] + " ");
                a=a/10;
            }
            else
                break;
        }
        return rev;
    }
}

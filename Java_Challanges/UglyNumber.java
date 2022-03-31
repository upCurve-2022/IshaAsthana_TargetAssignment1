package Java_Challanges;

import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        int num,k=0;
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        num = sc.nextInt();
        int n = num;
        for(int i=1;i<=num;i++){
            if(num%i == 0){
                num = num/i;
                k=i;
                if(k%2==0 || k==3 || k==5 || k==1)
                    flag = true;
                else
                    flag = false;
                }
        }
        if(flag)
            System.out.println(n + " is an ugly number.");
        else
            System.out.println(n + " is not an ugly number.");
    }
}

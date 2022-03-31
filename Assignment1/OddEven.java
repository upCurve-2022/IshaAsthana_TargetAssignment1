package Assignment1;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number : ");
        a = in.nextInt();
        if(a%2==0){
            System.out.println(a + " is even.");
        }
        else
            System.out.println(a + " is odd.");
    }
}

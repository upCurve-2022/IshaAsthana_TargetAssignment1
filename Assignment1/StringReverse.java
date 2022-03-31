package Assignment1;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String a;
        int len = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to be reversed : ");
        a = sc.nextLine();
        len = a.length();
        String rev = "";
        while (len > 0) {
            char val = a.charAt(len-1);
            rev += val;
            len--;
        }
        System.out.println(rev);
    }
}

package Assignment1;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        String word;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to be checked : ");
        word = sc.nextLine();
        String a = word;
        String reversed = reverseString(word);
        if(a.equals(reversed))
            System.out.println(word + " is palindrome");
        else
            System.out.println(word + " is not a palindrome!");
    }
    public static String reverseString(String a){
        int len=0;
        len=a.length();
        String rev = "";
        while(len!=0){
            char val = a.charAt(len-1);
            rev +=val;
            len--;
        }
        return rev;
    }
}

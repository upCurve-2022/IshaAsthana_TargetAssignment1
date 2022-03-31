package Java_Challanges;

import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        str = sc.nextLine();
        String[] sArr = str.split("\\ ");
        System.out.println("Number of words in the given string = " + sArr.length);
    }
}

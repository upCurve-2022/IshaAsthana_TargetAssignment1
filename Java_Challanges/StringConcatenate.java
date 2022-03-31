package Java_Challanges;

import java.util.Scanner;

public class StringConcatenate {
    public static void main(String[] args) {
        String str1,str2,str3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String : ");
        str1 = sc.nextLine();
        System.out.println("Enter the second String : ");
        str2 = sc.nextLine();
        str3 = str1 + " " + str2;
        System.out.println("Concatenated string : " + str3);
    }
}

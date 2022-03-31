package Java_Challanges;

import java.util.Scanner;

public class CharacterReplace {
    public static void main(String[] args) {
        String str;
        char a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        str = sc.nextLine();
        System.out.println("Enter the character to be replaced : ");
        a = sc.next().charAt(0);
        System.out.println("Enter the character to be replaced with : ");
        b = sc.next().charAt(0);
        str = str.replace(a,b);
        System.out.println("New string : " + str);
    }
}

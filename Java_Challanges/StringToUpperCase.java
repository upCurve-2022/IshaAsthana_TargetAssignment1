package Java_Challanges;

import java.util.Scanner;

public class StringToUpperCase {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i) >=97 && (int)str.charAt(i) <=122){
                int a = (int)str.charAt(i) - 32;
                System.out.print((char)a);
            }
            else
                System.out.print(str.charAt(i));
        }
    }
}

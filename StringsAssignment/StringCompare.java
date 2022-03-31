package StringsAssignment;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        String str1,str2;
        int count = 0, size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string : ");
        str1 = sc.nextLine();
        System.out.println("Enter the second string : ");
        str2 = sc.nextLine();
        if(str1.length() == str2.length()){
            size = str1.length();
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i) == str2.charAt(i))
                    count++;
            }
            if(count == size)
                System.out.println("Strings are equal.");
            else
                System.out.println("Strings are unequal!");
        }
        else
            System.out.println("Strings are unequal!");
    }
}

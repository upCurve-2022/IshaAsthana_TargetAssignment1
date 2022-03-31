package StringsAssignment;

import java.util.Scanner;

public class EmptyString {
    public static void main(String[] args) {
        String arr;
        int count = 0, size = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        arr = sc.nextLine();
        size = arr.length();
        for(int i=0;i<arr.length();i++){
            if(arr.charAt(i) == ' ')
                count++;
        }
        if(count == size)
            System.out.println("The given string is empty!");
        else
            System.out.println("The string is not empty.");
    }
}

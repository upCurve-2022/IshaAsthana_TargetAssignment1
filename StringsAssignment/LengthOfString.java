package StringsAssignment;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        String word;
        int len, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        word = sc.nextLine();
        char[] array = word.toCharArray();
        for(int i=0;i< array.length;i++){
            if(array[i] != ' ')
                count++;
        }
        System.out.println("Length of the string = " + count);
    }
}

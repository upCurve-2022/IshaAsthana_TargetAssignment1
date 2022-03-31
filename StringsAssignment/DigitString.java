package StringsAssignment;

import java.util.Scanner;

public class DigitString {
    public static void main(String[] args) {
        String word;
        char[] digits = {'1','2','3','4','5','6','7','8','9','0'};
        int count = 0, size=0, j=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        word = sc.nextLine();
        for(int i=0;i<word.length();i++){
            while(j<digits.length){
                if(word.charAt(i) != ' '){
                    if(word.charAt(i) == digits[j])
                        count++;
                }
                j++;
            }
            j=0;
        }
        for(int k=0;k<word.length();k++){
            if(word.charAt(k) != ' ')
                size++;
        }
        if(count == size)
            System.out.println("The given string only consists of digits!");
        else
            System.out.println("The given string consists of letters as well!");
    }
}

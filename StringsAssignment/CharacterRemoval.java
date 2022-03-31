package StringsAssignment;

import java.util.Locale;
import java.util.Scanner;

public class CharacterRemoval {
    public static void main(String[] args) {
        String word;
        char letter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        word = sc.nextLine();
        System.out.println("Enter the letter to be removed(in lower case): ");
        letter = sc.next().charAt(0);
        String upper = word;
        char up = letter;
        upper = upper.toLowerCase(Locale.ROOT);
        for(int i=0;i<upper.length();i++){
            if(upper.charAt(i) == letter)
                upper = upper.replace(letter,' ');
        }
        System.out.println(upper);
    }
}

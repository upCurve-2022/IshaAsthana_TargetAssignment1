package Java_Challanges;

import java.util.Locale;
import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str;
        boolean flag=false;
        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        str = sc.nextLine();
        str = str.toLowerCase(Locale.ROOT);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=97 && str.charAt(i)<=122){
                for(int j=i+1;j<str.length();j++){
                    if(str.charAt(i) == str.charAt(j))
                        count++;
                }
            }
            if(count>1){
                System.out.println(str.charAt(i) + " is repeated " + count + " times.");
                flag=true;
            }
            str = str.replace(str.charAt(i),' ');
            count = 1;
        }
        if(!flag)
            System.out.println("No duplicate characters!");
    }
}

package Java_Challanges;

import java.util.Locale;
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        String str;
        int len,count=1;
        float permutations=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string to find its permutations : ");
        str = sc.nextLine();
        len = str.length();
        str = str.toLowerCase(Locale.ROOT);
        permutations = fact(len);
        for(int i=0;i<len;i++){
            int k=i;
            if(str.charAt(k)>=97 && str.charAt(k)<=122){
                for(int j=i+1;j<len;j++){
                    int l=j;
                    if(str.charAt(k) == str.charAt(l)){
                        count++;
                    }
                }
                System.out.println(count);
                str = str.replace(str.charAt(k),' ');
                permutations /= fact(count);
                count = 1;
            }
        }
        System.out.println("Number of permutations of " + str + " = " + permutations);
    }
    public static int fact(int num){
        int factorial=1;
        for(int i=num;i>0;i--){
            factorial *= i;
        }
        return factorial;
    }
}

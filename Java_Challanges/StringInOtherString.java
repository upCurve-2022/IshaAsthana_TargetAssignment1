package Java_Challanges;

import java.util.Scanner;

public class StringInOtherString {
    public static void main(String[] args) {
        String str1,str2,str3="";
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string : ");
        str1 = sc.nextLine();
        System.out.println("Enter the second string : ");
        str2 = sc.nextLine();
        if(str2.length() > str1.length())
            System.out.println("The first string does not contains the second string!");
        else{
            for(int i=0;i<str1.length();i++){
                str3 = "";
                for(int j=i;j<str1.length();j++){
                    str3 += str1.charAt(j);
//                    System.out.println(str3);
                    if(str2.equals(str3)){
                        System.out.println("The first string consists of the second string.");
                        break;
                    }
                }
                if(str2.equals(str3))
                    break;
//                else{
//                    System.out.println("The first string does not contains the second string!");
//                    break;
//                }
            }
            if(!str2.equals(str3))
                System.out.println("The first string does not contains the second string!");

        }
    }
}

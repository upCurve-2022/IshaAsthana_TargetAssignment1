package StringsAssignment;

import java.util.Scanner;

public class RemoveHyphen {
    public static void main(String[] args) {
        StringBuffer arr = new StringBuffer();
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        arr.append(sc.nextLine());
        for(int i=0;i<arr.length();i++) {
            if (arr.charAt(i) == '-') {
                j=i;
                if((int)arr.charAt(j-1) >=48 && (int)arr.charAt(j+1) <=57)
                    arr.delete(j-1,j+1);
            }
        }
        System.out.println(arr);
    }
}

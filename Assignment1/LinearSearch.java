package Assignment1;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int a,len;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter any " + len + " numbers : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched : ");
        a = sc.nextInt();
        for(int j=0;j<arr.length;j++){
            if(arr[j] == a){
                System.out.println(a + " found at location " + (j+1));
                break;
            }
            else if(arr[j] != a && (j==len-1))
                System.out.println("Index of " + a + " was not found!");
        }
    }
}

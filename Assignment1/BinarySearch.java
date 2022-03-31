package Assignment1;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int first,last, middle, len,a,loc1=0,loc2=0;
        boolean check=true, check1=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the elements in the array(in ascending order) : ");
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched : ");
        a = sc.nextInt();
        first = 0;
        last = len-1;
        middle = (first + last)/2;
        while(first<=last){
            if(arr[middle]<a){
                first = middle + 1;
            }
            else if(arr[middle] == a){
                System.out.println(a + " found at position : " + (middle+1));
                break;
            }
            else
                last = middle-1;
            middle = (first + last)/2;
        }
        if(first>last)
            System.out.println(a + " not found!");
    }
}

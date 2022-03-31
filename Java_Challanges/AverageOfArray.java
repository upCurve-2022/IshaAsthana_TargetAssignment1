package Java_Challanges;

import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        n = sc.nextInt();
        float[] arr = new float[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextFloat();
        }
        float sum = 0, avg = 0;
        for(int j=0;j<arr.length;j++){
            sum += arr[j];
        }
        avg = sum/n;
        System.out.println("Average of the given array = " + avg);
    }
}

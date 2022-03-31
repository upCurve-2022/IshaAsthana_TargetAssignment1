package Assignment1;

import java.util.Scanner;

public class LessThanPrevious {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        n = sc.nextInt();
        System.out.print(1 + " ");
        for(int i=2;i<n;i++){
            int x = digitsProduct(i*i);
            int y = digitsProduct((i-1)*(i-1));
            if(x>y){
                System.out.print(i*i + " ");
            }
        }

    }
    public static int digitsProduct(int a){
        int k=1;
        while(a>0){
            int i = a%10;
            k*=i;
            a=a/10;
        }
        return k;
    }
}

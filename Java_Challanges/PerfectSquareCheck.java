package Java_Challanges;

import java.util.Scanner;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        float a;
        int b;
        int i=10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked : ");
        a = sc.nextFloat();
        float d = a-(int)a;
        b=(int)a;
        if(d != 0){
            while(i!=0){
                float c = a*i;
                if(c-(int)c == 0){
                    b = (int)c;
                    break;
                }
                else
                    i=i*10;
            }
        }
        for(int j=1;j<b/2;j++){
            if(j*j == b){
                System.out.println(a + " is a perfect square.");
                break;
            }
            else if(j*j > b){
                System.out.println(a + " is not a perfect square!");
                break;
            }
        }
    }
}

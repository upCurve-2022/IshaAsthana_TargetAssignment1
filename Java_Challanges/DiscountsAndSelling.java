package Java_Challanges;

import java.util.Scanner;

public class DiscountsAndSelling {
    public static void main(String[] args) {
        float cost,dis,sP,discount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of the pen : ");
        cost = sc.nextFloat();
        System.out.println("Enter the percentage discount : ");
        dis = sc.nextFloat();
        discount = (cost*dis)/100;
        sP = cost - discount;
        System.out.println("Discount given = " + discount);
        System.out.println("Selling Price of the pen = " + sP);
    }
}

package Exception_Handling;

import java.util.Scanner;

public class SwiggyDelivery {
    public static void main(String[] args) {
        int zip;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the zip code for your area : ");
        try{
            zip = sc.nextInt();
            if(zip==123 || zip==456 || zip==789)
                throw new ZipCodeException("Non-deliverable zip code! Please enter a valid zip code.");
            else
                System.out.println("Delivery available in your area!");
        }catch (ZipCodeException e){
            System.out.println(e.getMessage());
        }
    }
}

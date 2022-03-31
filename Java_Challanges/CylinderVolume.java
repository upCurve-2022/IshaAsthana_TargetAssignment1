package Java_Challanges;

import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        double rad,vol=0,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder : ");
        rad = sc.nextDouble();
        System.out.println("Enter the height of the cylinder : ");
        h = sc.nextDouble();
        vol = Math.PI*(rad*rad)*h;
        System.out.println("Volume of the cylinder is = " + vol);
    }
}

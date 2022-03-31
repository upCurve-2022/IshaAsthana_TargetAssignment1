package Java_Challanges;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataToFile {
    public static void main(String[] args) throws IOException {
        String s,fileName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the path of the file to be edited : ");
        fileName = sc.nextLine();
        System.out.println("Enter the data to be entered into the file : ");
        s = sc.nextLine();
        try{
            FileOutputStream dout = new FileOutputStream(fileName);
            byte[] b = s.getBytes();
            dout.write(b);
            dout.close();
            System.out.println("Data edited successfully.");
        } catch (Exception e){
            System.out.println("Error occurred!");
        }
    }
}

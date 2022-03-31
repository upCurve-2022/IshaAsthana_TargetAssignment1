package Java_Challanges;

import java.io.*;
import java.util.Scanner;

public class CopyDataFromOneFileToAnother {
    public static void main(String[] args) throws IOException {
        String file1,file2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the path of file from data is to be copied : ");
        file1 = sc.nextLine();
        System.out.println("Enter the path of the file where data has to be copied : ");
        file2 = sc.nextLine();
        FileReader fin = new FileReader(file1);
        FileWriter fout = new FileWriter(file2,true);
        int c;
        while((c=fin.read()) != -1){
            fout.write(c);
        }
        System.out.println("Copied Successfully!");
        fin.close();
        fout.close();
    }
}

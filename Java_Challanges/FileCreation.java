package Java_Challanges;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreation {
    public static void main(String[] args) throws IOException {
        String filePath;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the path of the file to be created : ");
        filePath = sc.nextLine();
        File newFile = new File(filePath);
        if(newFile.createNewFile()){
            System.out.println("New file created : " + newFile.getName());
        }
        else
            System.out.println("File already exists.");
    }
}

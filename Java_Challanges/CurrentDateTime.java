package Java_Challanges;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime {
    public static void main(String[] args) {
        DateFormat dateTime = new SimpleDateFormat("dd-MM-yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateTime.format(date));
    }
}

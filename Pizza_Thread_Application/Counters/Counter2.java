package Counters;

import Chefs.Chef2;

import java.util.ArrayList;
import java.util.List;

public class Counter2 extends Thread{
    public static List<String> list = new ArrayList<>();
    CustomerDetails cd = new CustomerDetails();
    List<String> name = new ArrayList<>();

    @Override
    synchronized public void run() {

        for(int i=3;i<6;i++){
            System.out.println(list.get(i));
            System.out.println();
            Chef2 c2 = new Chef2();
            c2.run();
            System.out.println("Order id : "+ (i+1) + "\n" + name.get(i) + " your order is prepared." +
                    "\nPlease collect your order from Counter 2.\n======================Enjoy your meal!======================");
            System.out.println();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Counter2(){
        list.add(cd.order1);
        list.add(cd.order2);
        list.add(cd.order3);
        list.add(cd.order4);
        list.add(cd.order5);
        list.add(cd.order6);
        list.add(cd.order7);
        list.add(cd.order8);
        list.add(cd.order9);
        name.add(cd.name1);
        name.add(cd.name2);
        name.add(cd.name3);
        name.add(cd.name4);
        name.add(cd.name5);
        name.add(cd.name6);
        name.add(cd.name7);
        name.add(cd.name8);
        name.add(cd.name9);
    }
}
package Chefs;

import Counters.CustomerDetails;

public class Chef3 extends Thread{
    CustomerDetails cd = new CustomerDetails();
    int time = cd.timeForPreparation();

    @Override
    synchronized public void run(){
        try {
            Thread.sleep(100*time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

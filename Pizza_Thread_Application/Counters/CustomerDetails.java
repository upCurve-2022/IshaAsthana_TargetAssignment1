package Counters;

import Order.*;

public class CustomerDetails {
    static PeppiPaneer pp = new PeppiPaneer();
    static DoubleCheeseMargherita dm = new DoubleCheeseMargherita();
    static TomatoAndOnion to = new TomatoAndOnion();
    static VeggiesOverloaded vo = new VeggiesOverloaded();
    static StuffedGarlicBread sg = new StuffedGarlicBread();
    static VegParcel vp = new VegParcel();
    static ChocoLavaCake ck = new ChocoLavaCake();

    static int time1 = pp.getPreparationTime()+sg.getPreparationTime()+vp.getPreparationTime();
    static int time2 = dm.getPreparationTime()+sg.getPreparationTime()+ck.getPreparationTime();
    static int time3 = pp.getPreparationTime()+vp.getPreparationTime()+ck.getPreparationTime();
    static int time4 = vo.getPreparationTime()+sg.getPreparationTime()+vp.getPreparationTime();
    static int time5 = to.getPreparationTime()+sg.getPreparationTime()+ck.getPreparationTime();
    static int time6 = pp.getPreparationTime()+dm.getPreparationTime()+vp.getPreparationTime();
    static int time7 = vo.getPreparationTime()+pp.getPreparationTime()+dm.getPreparationTime();
    static int time8 = pp.getPreparationTime()+sg.getPreparationTime()+vp.getPreparationTime();
    static int time9 = pp.getPreparationTime()+sg.getPreparationTime()+vp.getPreparationTime();
    static int time;

    static String order1 = "Name : Isha \nItems ordered : \n1.Peppi Paneer \n2.Stuffed Garlic Bread \n3.Veg Parcel" +
            "\n Your order will get ready within : " + (time = time1) + " minutes";
    static String order2 = "Name : Shreya \nItems ordered : \n1.Double Cheese Margherita \n2.Stuffed Garlic Bread \n3.ChocoLava Cake" +
            "\n Your order will get ready within : " + (time = time2) + " minutes";
    static String order3 = "Name : Priya \nItems ordered : \n1.Peppi Paneer \n2.Veg Parcel \n3.ChocoLava Cake" +
            "\n Your order will get ready within : " + (time = time3) + " minutes";
    static String order4 = "Name : Nidhi \nItems ordered : \n1.Veggies Overloaded \n2.Stuffed Garlic Bread \n3.Veg Parcel" +
            "\n Your order will get ready within : " + (time = time4) + " minutes";
    static String order5 = "Name : Pooja \nItems ordered : \n1.Tomato and Onion \n2.Stuffed Garlic Bread \n3.ChocoLava Cake" +
            "\n Your order will get ready within : " + (time = time5) + " minutes";
    static String order6 = "Name : Raghav \nItems ordered : \n1.Peppi Paneer \n2.Double Cheese Margherita \n3.Veg Parcel" +
            "\n Your order will get ready within : " + (time = time6) + " minutes";
    static String order7 = "Name : Nakul \nItems ordered : \n1.Veggies Overloaded \n2.Peppi Paneer \n3.Double Cheese Margherita" +
            "\n Your order will get ready within : " + (time = time7) + " minutes";
    static String order8 = "Name : Nanda \nItems ordered : \n1.Peppi Paneer \n2.Stuffed Garlic Bread \n3.Veg Parcel" +
            "\n Your order will get ready within : " + (time = time8) + " minutes";
    static String order9 = "Name : Sushant \nItems ordered : \n1.Peppi Paneer \n2.Stuffed Garlic Bread \n3.Veg Parcel" +
            "\n Your order will get ready within : " + (time = time9) + " minutes";

    public static int timeForPreparation(){
        return time;
    }

    public static String name1 = "Isha";
    public static String name2 = "Shreya";
    public static String name3 = "Priya";
    public static String name4 = "Nidhi";
    public static String name5 = "Pooja";
    public static String name6 = "Raghav";
    public static String name7 = "Nakul";
    public static String name8 = "Nanda";
    public static String name9 = "Sushant";
}

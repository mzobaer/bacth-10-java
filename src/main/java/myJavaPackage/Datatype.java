package myJavaPackage;

import java.lang.reflect.Array;

public class Datatype {

    /*
    byte -- it can hold upto 127
    short --
    int
    long
    float
    double
    boolean
    char
    string

     */

    public static void main(String[] args) {
//declare some variables
        String model;
        model = "iphone 16";
        model = "iphone 17";
//       String firstName = "MD"

        byte ramsize = 107;
        ramsize = 100;
        short  stockquantity = 29000;
        stockquantity = 25000 ;
        int price = 120000 ;
        long recipttNo = 1223778185685478801L;
        float screensize = 5.54f;
        double iphonestockprice = 400.343493743;
        boolean iphone15avaiable = false;
        char size= 'm';



        System.out.println("The model of the phone is "+ model +  " ..\n this is the leatest model as of now ");
        System.out.println("the size is phone ram is "  + ramsize + " \t Ram is well enough for fight in market compitation");
        System.out.println("The price of the phone is $"  + price + " price determine for market compitator");
        System.out.println("The Sreensize of the phone is "  + screensize + " follow the sumsung market");
        System.out.println("Now the iphone stock proce is "  + iphonestockprice + " stock are went high");
        System.out.println("In market just iphone 15 avaiable "  + iphone15avaiable + " iphn 17 all series are on the way");
        System.out.println("The size of the phone "  + size + " new series are also have better size");

        // printing multiple variable in single line
        System.out.println("the phone model is " + model+ " the ramsize is " + ramsize + " the price of the phone " +price);

        System.out.println("git change");


    }

}

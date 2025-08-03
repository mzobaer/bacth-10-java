public class variaabledemos {

       /*
        there are few type of variabale

       1. Global variable -- The variables we declare inside the class
       2. Local Variable -- The variable we declare inside the method
       3. Static variable--
       4.parameter --
        */
 String model = "iphn 17"; // global variable

//    system.out.println (model) ; -- not possible ,class cannt hold any command



public void clickpicture(){  //custom method
     float screensize = 5.545_45f;
    System.out.println(screensize);
    System.out.println(screensize); // method can hold command but cannot run command
}

public void purchasstoke(){
     double iphonestockprice = 40.341;
}

}

public static void main(String[] args) {

    byte ramsize = 100;// local variable

    System.out.println(ramsize);



}
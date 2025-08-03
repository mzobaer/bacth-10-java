package myJavaPackage;

public class parameterdemo {
//    parameter betong to method only

    public void addition(int a, int b, int d) {
//    int a = 20;
//    a =60;
//    int b = 30;
//    b = 70;

        int c = a + b;

        System.out.println(c);

        int e = c + d;
        System.out.println(e);

    }

    public void addition2(double a, double b) {
        System.out.println(a-b);
    }

    public void information(String name, String profession) {

        System.out.println(STR."my name is \{name} and prossion is \{profession}");

    }

    public void addition3(int a, int b){

        System.out.println(a*b);


    }

    public static void main(String[] args) {
        parameterdemo obj = new parameterdemo();
        obj.addition(70, 90, 100);
        obj.addition2(2.3336661, 9.326621);
        obj.information("arnob", "It");
        obj.addition3(2580,17000);


    }

}

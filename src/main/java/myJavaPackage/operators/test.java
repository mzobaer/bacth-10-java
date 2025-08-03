package myJavaPackage.operators;

public class test {

    static void Arnob (int a) {
        if (a > 0) {
            System.out.println(a + " is a Positive number.");
        } else if (a < 0) {
            System.out.println(a + " is a Negative number.");
        } else if (a==0) {
            System.out.println(a + " is zero");
        } else {
            System.out.println("The number is Zero.");
        }
    }

//    check if the year is leap year or not

    static void LeapYear ( int year) {

        if (year %4 ==0)
            System.out.println( year + " its a leap year");

}
    public static void main(String[] args) {
//        Arnob(-6);
        LeapYear(2028);

    }

}

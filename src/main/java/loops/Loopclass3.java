package loops;

public class Loopclass3 {

    public static void print_100(){

        int a = 1;
        while (a<=100) {
            ;

            System.out.println(a + " times -- hello");

            if (a%2==0){
                System.out.println(a + " is a even Number");

            } else if (a%2==1){
                System.out.println(a + " is a odd number");
            } else {

                System.out.println(" got nothing");
            }

           a++;


        }

    }


    public static void main(String[] args) {
        print_100();
    }

}

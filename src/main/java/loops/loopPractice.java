package loops;

public class loopPractice {

    static  void Loopintro(){
int a = 50;
while ( a <= 70){

    System.out.println("hello");
    a++;
}
// create a loop from 50-70 and print "hello"

     }
static void loop2() {
    int a = 100;
    while (a >= 1) {
        System.out.println("the value of is" + a);
        a--;

    }
//between 1-100 ,please detarmain which num is even and which is odd


}

   static void evenOdd(){
        int a = 1;
        while (a<=100){

            if (a%2==0){
                System.out.println(a + " is a even Number");

            } else {
                System.out.println(a + " is a odd number");
            }
                   a++;
        }
   }


   public static void main(String[] args) {
       Loopintro();
       loop2();
       evenOdd();
    }
}

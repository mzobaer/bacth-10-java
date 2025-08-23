package myJavaPackage.arrayPractice;

public class ArrayDemo {

    // Array elements always use index values that start from 0
    // Array length is fixed
    // Array can hold multiple values
    String[] name = {"Bashir", "Arafat", "Shift"};
    Integer[] number = {2, 4, 9, 16, 42, 75};
/**
 * we use array,when we have multiple data in same type
 * and same category
 */
void accessToArray() {
        // Accessing array elements by index
//        System.out.println(name[0]);                      // Bashir
//        System.out.println(name[1]);                      // Arafat
//        System.out.println(name[name.length - 1]);       // Shift
//
//         Printing the length of the array
//        System.out.println(name.length);

        // Loop through array using a for loop and print each name
//        for (int i = 0; i < name.length; i++) {
//            System.out.println(name[i]);
//        }

        int a = 0;
        while (a<=name.length-1){
            System.out.println(name[a]);
            a++;


        };



    }

    void evenOdd() {
//        System.out.println(number[0]);
//        System.out.println(number.length);

        int a = 0;
        while (a<=6) {
            System.out.println(number[a]);
            a++;
        }
    }

    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo();
        obj.accessToArray();
//        obj.evenOdd();
    }
}
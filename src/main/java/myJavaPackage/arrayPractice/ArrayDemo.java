package myJavaPackage.arrayPractice;

public class ArrayDemo {

    // Array elements always use index values that start from 0
//    array length is fixed
//    Array can hold multiple value
    String[] name = {"Bashir", "Arafat", "Shift"};

    void accessToArray() {
        // Accessing array elements by index
        System.out.println(name[0]);                      // Bashir
        System.out.println(name[1]);                      // Arafat
        System.out.println(name[name.length - 1]);        // Shift

        // Printing the length of the array
        System.out.println(name.length);

        // Loop through array using a for loop
        for (int x = 0; x <= name.length - 1; x++) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo();
        obj.accessToArray();
    }
}

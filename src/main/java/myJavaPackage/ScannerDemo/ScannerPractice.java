package myJavaPackage.ScannerDemo;

import java.util.Scanner;

public class ScannerPractice {


    public void information() {

//        String name = "Arnob";
//        String profession = "IT";

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("my name is " + name+ " i live in Boston");
//        scan.nextLine();
       int age = scan.nextInt();
        System.out.println("my age is " + age);
        boolean isstudent = scan.nextBoolean();
        System.out.println("am i a student" + isstudent);
        float hight = scan.nextFloat();
        System.out.println("my hight is " +hight);
        byte weight = scan.nextByte();
        System.out.println("my weight is " + weight );

    }

    //System.out.println("my name is " + name + " and profession is " + profession);


    public static void main(String[] args) {
        ScannerPractice obj = new ScannerPractice();
        obj.information();

    }
}

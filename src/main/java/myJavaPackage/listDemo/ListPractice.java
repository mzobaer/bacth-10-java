package myJavaPackage.listDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ListPractice {
//Arraylist can hold duplicate value
//    Array follow insertion order
//    Array is Static but arraylist is dynamic.we can add and remove

    ArrayList<String> name = new ArrayList<>();
    ArrayList<Integer> age = new ArrayList<>();
    ArrayList<Float> height = new ArrayList<>();

    public void ArraylistDemo(){
        name.add("Arnob");
        name.add("Akash");
        name.add("Ankon");
        name.add("Arosh");
        System.out.println(name);
        System.out.println(name.get(2));
        name.remove(1);

        name.add("Tomal");
        System.out.println(name);
        Collections.sort(name);
        System.out.println(name);
//        Collections.swap(name);
//        System.out.println(name);

        age.add(16);
        age.add(19);
        age.add(96);
        age.add(25);
        System.out.println(age);
        System.out.println(age.get(2));
        age.remove(1);

        age.add(18);
        System.out.println(age);
        Collections.sort(age);
        System.out.println(age);

        height.add(5f);
        height.add(4.1f);
        height.add(9.6f);
        height.add(2.5f);
        System.out.println(height);
        System.out.println(height.get(1));
        height.remove(1);

        height.add(18f);
        System.out.println(height);
        Collections.sort(height);
        System.out.println(height);

        Collections.shuffle(height);
        System.out.println(height);




    }

    public static void main(String[] args) {
        ListPractice obj = new ListPractice();
        obj.ArraylistDemo();
    }

}

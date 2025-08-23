package myJavaPackage.listDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ListPractice {
    // ArrayList can hold duplicate values
    // Array follows insertion order
    // Array is static but ArrayList is dynamic. We can add and remove elements

    ArrayList<String> name = new ArrayList<>();
    ArrayList<Integer> age = new ArrayList<>();
    ArrayList<Float> height = new ArrayList<>();
    ArrayList<Integer> value = new ArrayList<>();
    ArrayList<String> cars = new ArrayList<>();

    public void arrayListDemo() {
        name.add("Arnob");
        name.add("Akash");
        name.add("Ankon");
        name.add("Arosh");
        System.out.println("Names: " + name);
        System.out.println("Name at index 2: " + name.get(2));

        name.remove(1); // remove "Akash"
        name.add("Tomal");
        System.out.println("After remove & add: " + name);

        Collections.sort(name);
        System.out.println("Sorted names: " + name);

        // ✅ Example of swap
        Collections.swap(name, 0, 2);
        System.out.println("After swap: " + name);

        // --- Ages ---
        age.add(16);
        age.add(19);
        age.add(96);
        age.add(25);
        System.out.println("Ages: " + age);
        System.out.println("Age at index 2: " + age.get(2));

        age.remove(1);
        age.add(18);
        System.out.println("After remove & add: " + age);

        Collections.sort(age);
        System.out.println("Sorted ages: " + age);

        // --- Heights ---
        height.add(5f);
        height.add(4.1f);
        height.add(9.6f);
        height.add(2.5f);
        System.out.println("Heights: " + height);
        System.out.println("Height at index 1: " + height.get(1));

        height.remove(1);
        height.add(18f);
        System.out.println("After remove & add: " + height);

        Collections.sort(height);
        System.out.println("Sorted heights: " + height);

        Collections.shuffle(height);
        System.out.println("Shuffled heights: " + height);
    }

    public void carList() {
        cars.add("Nissan");
        cars.add("Toyota");
        cars.add("Rickshaw");
        cars.add("Laguna");
        cars.add("Honda");
        System.out.println("Car list: " + cars);
        int carSize = cars.size();
        System.out.println(carSize);
        boolean empty = cars.isEmpty();
        System.out.println(empty);

        cars.add("public bus");
        cars.add("double dekae");
        cars.remove(3);
        System.out.println(cars);

        for (int i = 0; i<=cars.size(); i++){
            System.out.println(cars.getFirst());

        }



        value.add(30000);
        value.add(102151);
        value.add(961110);
        value.add(2151581);
        value.add(2151581);

        System.out.println("Car values: " + value);
        Collections.sort(value);
        System.out.println("Sorted car values: " + value);
    }

    public static void main(String[] args) {
        ListPractice obj = new ListPractice();
//        obj.arrayListDemo();
        obj.carList();
    }
}
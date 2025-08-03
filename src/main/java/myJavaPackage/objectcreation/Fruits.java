package myJavaPackage.objectcreation;

public class Fruits {
    String name;
    String color;
    boolean isSeasonal;
    String taste;
    float weight;
    boolean isRipe;
    int keepFreshFor;
    String origin;


    public void describeTaste() {
        System.out.println(name + " tastes " + taste + ".");
    }


    public void ripenessStatus() {
            System.out.println(name + " is not ripe yet. Wait a few more days.");
        }

    public void nutritionInfo() {
        System.out.println(name + " is rich in vitamins and a healthy addition to your diet.");
    }

    
    public static void main(String[] args) {
        Fruits mango = new Fruits();
        mango.name = "Mango";
        mango.color = "Yellow";
        mango.isSeasonal = true;
        mango.taste = "Sweet";
        mango.weight = 250.5f;
        mango.isRipe = true;
        mango.keepFreshFor = 5;
        mango.origin = "Bangladesh";

        Fruits apple = new Fruits();
        apple.name = "Apple";
        apple.color = "Red";
        apple.isSeasonal = false;
        apple.taste = "Crisp and sweet";
        apple.weight = 180.0f;
        apple.isRipe = true;
        apple.keepFreshFor = 7;
        apple.origin = "USA";

        // Mango info
        System.out.println("Fruit Name: " + mango.name);
        System.out.println("Color: " + mango.color);
        System.out.println("Weight: " + mango.weight + "g");
        System.out.println("Taste: " + mango.taste);
        System.out.println("Origin: " + mango.origin);




        mango.describeTaste();
        mango.ripenessStatus();
        mango.nutritionInfo();

        System.out.println();

        // Apple info
        System.out.println("Fruit Name: " + apple.name);
        System.out.println("Color: " + apple.color);
        System.out.println("Weight: " + apple.weight + "g");
        System.out.println("Taste: " + apple.taste);
        System.out.println("Origin: " + apple.origin);



        apple.describeTaste();
        apple.ripenessStatus();
        apple.nutritionInfo();
    }
}

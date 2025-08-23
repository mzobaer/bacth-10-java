package polymorphism;

public class Dogs extends OverRiding1 {

    @Override
    public boolean animal(String sound) {   // method name + parameter should match parent
        String dog = "Lally";
        System.out.println(dog + " sound is " + sound);
        return true;
    }

    public static void main(String[] args) {
        Dogs obj = new Dogs();
        obj.animal("Bark");  // fixed method name and parameter
    }
}
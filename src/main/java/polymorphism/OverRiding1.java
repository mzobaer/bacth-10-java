package polymorphism;

public class OverRiding1 {
    /*
     * The purpose of this method is to print the animal sound.
     * Created by Md Zobaer
     * @param sound The sound of the animal
     */
    public boolean animal(String sound) {
        System.out.println(sound);
        return true;
    }

    public static void main(String[] args) {
        OverRiding1 obj = new OverRiding1();
        obj.animal("Woof"); // Example: Dog sound
    }
}
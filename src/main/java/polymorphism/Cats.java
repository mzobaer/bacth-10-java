package polymorphism;

public class Cats extends OverRiding1 {

    @Override
    public void animal(String sound) {
        String myCat = "Kitty";
        System.out.println(myCat + "'s sound is " + sound);
    }

    public static void main(String[] args) {
        Cats obj = new Cats();
        obj.animal("meaw");
    }
}
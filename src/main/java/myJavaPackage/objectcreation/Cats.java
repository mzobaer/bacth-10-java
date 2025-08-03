package myJavaPackage.objectcreation;
// declaring of some variable
public class Cats {
    String name;
    int age;
    String breed;
    float weight;
    char gender;
    boolean isFriendly;
    boolean isVaccinated;
    String shelter;
    int tagnum;

    // Method to describe behavior
    public void behavior() {
        System.out.println("All the cats are normally friendly and pet animals.");
    }

    // Method to describe skin color
    public void skin() {
        System.out.println("In the shelter, most cats are white and black mixed.");
    }

    public void placement(){
        System.out.println("The shelter place are nice and clean");
    }

    // Main method to run the code
    public static void main(String[] args) {
        Cats blackCat = new Cats();
        blackCat.name = "Hasina";
        blackCat.age = 3;
        blackCat.breed = "Persian";
        blackCat.weight = 4.2f;
        blackCat.gender = 'F';
        blackCat.isFriendly = true;
        blackCat.isVaccinated = true;
        blackCat.shelter = "Dhaka Animal Shelter";
        blackCat.tagnum = 301;

        Cats whitecat = new Cats();
        whitecat.name = "jommon";
        whitecat.age = 4;
        whitecat.breed = "Deshi";
        whitecat.weight = 9.2f;
        whitecat.gender = 'M';
        whitecat.isFriendly = true;
        whitecat.isVaccinated = true;
        whitecat.shelter = "Dhaka Animal Shelter";
        whitecat.tagnum = 302;

        System.out.println("Frist cat Name: " + blackCat.name);
        System.out.println("Her Age: " + blackCat.age);
        System.out.println("Her Breed: " + blackCat.breed);
        System.out.println("the Weight she are right now: " + blackCat.weight);
        System.out.println("Her Gender: " + blackCat.gender);
        System.out.println("Is she human Friendly: " + blackCat.isFriendly);
        System.out.println("Is she fully Vaccinated: " + blackCat.isVaccinated);
        System.out.println("Her Shelter name : " + blackCat.shelter);
//        add extra commad if need after veriable
        System.out.println("her tag num is : " + blackCat.tagnum +  " this num is unique for every cats.");
// called the method
        blackCat.behavior();
        blackCat.skin();
        blackCat.placement();


        System.out.println("Second cat Name: " + whitecat.name);
        System.out.println("His Age: " + whitecat.age);
        System.out.println("Breed: " + whitecat.breed);
        System.out.println("his weight right now: " + whitecat.weight);
        System.out.println("Hir Gender: " + whitecat.gender);
        System.out.println("Is he human Friendly: " + whitecat.isFriendly);
        System.out.println("Is he fully Vaccinated: " + whitecat.isVaccinated);
        System.out.println("His Shelter name : " + whitecat.shelter);

        whitecat.behavior();
        whitecat.skin();
        whitecat.placement();


    }



}

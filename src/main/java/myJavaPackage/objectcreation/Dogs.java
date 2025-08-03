package myJavaPackage.objectcreation;


  public class Dogs {
        String name;
        int age;
        String breed;
        float weight;
        char gender;
        boolean isFriendly;
        boolean isVaccinated;
        String shelter;
        int tagnum;
        String color;
        String microchipId;
        int energyLevel;

        // Method to describe behavior
        public void behavior() {
            System.out.println("Dogs are usually loyal, active, and friendly companions.");
        }

        // Method to describe skin/fur color
        public void skin() {
            System.out.println("Most of the dogs in the shelter are brown or golden in color.");
        }

        // Method to describe shelter condition
        public void placement() {
            System.out.println("The dog shelter is spacious and well-maintained.");
        }
      public void vaccinationReminder() {
          System.out.println("fully vaccinated.");
      }

        // Main method to run the code
        public static void main(String[] args) {
            Dogs goldenDog = new Dogs();
            goldenDog.name = "Rocky";
            goldenDog.age = 5;
            goldenDog.breed = "Golden Retriever";
            goldenDog.weight = 30.5f;
            goldenDog.gender = 'M';
            goldenDog.isFriendly = true;
            goldenDog.isVaccinated = true;
            goldenDog.shelter = "Dhaka Animal Shelter";
            goldenDog.tagnum = 401;
            goldenDog.color = "Golden";
            goldenDog.microchipId = "MC-9843218";
            goldenDog.energyLevel = 8;

            Dogs brownDog = new Dogs();
            brownDog.name = "Luna";
            brownDog.age = 2;
            brownDog.breed = "German Shepherd";
            brownDog.weight = 25.0f;
            brownDog.gender = 'F';
            brownDog.isFriendly = true;
            brownDog.isVaccinated = false;
            brownDog.shelter = "Dhaka Animal Shelter";
            brownDog.tagnum = 402;
            brownDog.color = "Brown";
            brownDog.microchipId = "MC-395494";
            brownDog.energyLevel = 9;

            System.out.println("First Dog Name: " + goldenDog.name);
            System.out.println("Age: " + goldenDog.age);
            System.out.println("Breed: " + goldenDog.breed);
            System.out.println("Weight: " + goldenDog.weight);
            System.out.println("Gender: " + goldenDog.gender);
            System.out.println("Friendly with Humans: " + goldenDog.isFriendly);
            System.out.println("Vaccinated: " + goldenDog.isVaccinated);
            System.out.println("Shelter Name: " + goldenDog.shelter);
            System.out.println("Tag Number: " + goldenDog.tagnum);
            System.out.println("His colour: " + goldenDog.color);
            System.out.println("his Micro chip id :"  + goldenDog.microchipId);
            System.out.println("Energy level foud: " +goldenDog.energyLevel);

            // called the method here
            goldenDog.behavior();
            goldenDog.skin();
            goldenDog.placement();
            goldenDog.vaccinationReminder();


            System.out.println("Dog Name: " + brownDog.name);
            System.out.println("Age: " + brownDog.age);
            System.out.println("Breed: " + brownDog.breed);
            System.out.println("Weight: " + brownDog.weight);
            System.out.println("Gender: " + brownDog.gender);
            System.out.println("Friendly with Humans: " + brownDog.isFriendly);
            System.out.println("Vaccinated: " + brownDog.isVaccinated);
            System.out.println("Shelter Name: " + brownDog.shelter);
            System.out.println("Tag Number: " + brownDog.tagnum);
            System.out.println("Color: " + brownDog.color);
            System.out.println("Microchip ID: " + brownDog.microchipId);
            System.out.println("Energy Level: " + brownDog.energyLevel);

            // Call methods
            brownDog.behavior();
            brownDog.skin();
            brownDog.placement();
            brownDog.vaccinationReminder();


        }
    }


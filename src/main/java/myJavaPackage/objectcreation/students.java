package myJavaPackage.objectcreation;

public class students {

    // declare some variables
    String name;
    int id;
    String location;
    boolean isStudent;


    public void  study (){
        System.out.println("student study at home");
    }

    public void homework (){
        System.out.println("student bring homework in the class");
    }

    public static void main(String[] args) {
        students arnob = new students();
        //create an object of the class.(object1) reference variable
        // a class can be hold many object
        students ryan = new students();
        students zareef = new students();


        arnob.name = "arnob jobaer";
        arnob.id = 102;
        arnob.location = "boston";
        arnob.isStudent = true;
        System.out.println("arnob full name is " +arnob.name);
        System.out.println("arnob id is " +arnob.id);
        System.out.println("arnob location is " +arnob.location);

        arnob.study(); //we called the method
        arnob.homework(); //we called the method


        ryan.name = "zyan mridha";
        ryan.id = 103;
        ryan.location = "lynn";
        ryan.isStudent = true;
        System.out.println("ryan full name is " +ryan.name);
        System.out.println("ryan id is " +ryan.id);
        System.out.println("ryan location is " +ryan.location);

        ryan.study(); //we called the method
        ryan.homework(); //we called the method

        zareef.name = "zareef mridha";
        zareef.id = 104;
        zareef.location = "Salem";
        zareef.isStudent = true;
        System.out.println("zareef full name is " +zareef.name);
        System.out.println("zareef id is " +zareef.id);
        System.out.println("zareef location is " +zareef.location);

        zareef.study(); //we called the method
        zareef.homework(); //we called the method


    }


}

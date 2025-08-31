package myJavaPackage.Finalkeywords;
/*
final Keyword can be used before class,method and variables
if it is in before class,we cannot extend that class
if it is before a method,no one can override it.
if it is before a variables,no one can change the value.
 */
public class Final_1 {
    final String Schoolname ="upright tech solution";
    public void add(int a,int b){
        System.out.println("i am learning addition in Java");



    }

    public static void main(String[] args) {
        Final_1 obj =new Final_1();
        obj.Schoolname();
    }


}

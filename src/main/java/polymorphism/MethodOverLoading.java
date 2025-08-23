package polymorphism;

public class MethodOverLoading {

    public void count(int a){

        System.out.println(a+1);

    }
public void count (int a, int b){
    System.out.println(a+b);

}
 public void count (int a,int b, int c){
     System.out.println(a+b+c);

 }
    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();

        obj.count(10);
        obj.count(10,20,30);
        obj.count(10,20);


    }



}

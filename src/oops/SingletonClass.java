package oops;

public class SingletonClass {
   private SingletonClass(){

    }
    private static SingletonClass instance;
   static SingletonClass getInstance(){
       if (instance == null){
           instance = new SingletonClass();
       }
       return instance;
   }

}
class Main{
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();

        System.out.println(obj2);
        System.out.println(obj1);
    }
}

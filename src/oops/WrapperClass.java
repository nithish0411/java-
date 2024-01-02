package oops;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Integer c = 30;
        Integer d = 40;
        swap(a,b);// no change happens because , its only call by value (applicable for local scope)
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        swapInteger(c,d);// no change happens because its Integer is final class
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // final keyword
        final int BONUS = 1000; // can't modify
        // always initialize when we declare it
        /* for primitive data types , we cannot change the value
        for non-primitive datatype , we can change the value , but not change the whole reference
        final Student nithii = new Student();
        nithii.name = "pavithra"; --we can make it
        nithii = raman ;  we can't do this ,because of final
         *
         */
      final   A nithii = new A("nithii");
        nithii.name = "pavithra";
        System.out.println(nithii.name);
//        nithii = new A("pavithra");// because of final we cannot do this

        A obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new A("random object");
        }
        // we cannot call the finalize method , it's automatically called by jvm ,
//        when the object is deleted from the heap , java itself call the finalize method

    }
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void swapInteger(Integer a , Integer b ){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
  String name = "nithii";
  public A(String name){
      this.name = name;
  }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}

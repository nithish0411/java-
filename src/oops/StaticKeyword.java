package oops;

public class StaticKeyword {
    public static void main(String[] args) {
        Human nithii = new Human("nithii",23,20000,false);
        Human raman = new Human("raman",23,20000,true);
        System.out.println(Human.population);
        Human chan = new Human("chan",23,30000,true);
        System.out.println(Human.population);
    }
}

class Human{
    String name ;
    int age ;
    int salary ;
    boolean isMarried ;
    static long population = 100;
    public Human(String name,int age,int salary,boolean isMarried){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.population += 1;
    }
    /*
    we can call it without any object reference , it belongs to the class
    static method as well as static variable is available
    inside a static function , we can not use anything non-static
     */
    void greeting(){
        System.out.println("hi my name is nithish kumar");
    }
//    static void fun(){
//        greeting(); we cant do this because static function ,
//        inside non-static is not allowed
//          StaticKeyword.greeting(); which is also not allowed. because greeting() is instance specified
//         we cannot use this as class level
/*
inside non-static method , we can use static content
but inside static content , we cannot use non-static content
 */
//    }
}

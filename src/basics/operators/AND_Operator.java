package basics.operators;

public class AND_Operator {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int c = 2;
        // logical && and operator does not check the second  condition ,
        // if the first condition is false;
        System.out.println(b<a && c<a);
        // bitwise & and operator checks the second condition ,
        // if the 1st condition is false.
        System.out.println(b<a && c<a);
        //logical operator
        System.out.println(a>b && a++>c);
        System.out.println(a);
        //bitwise operator
        System.out.println(a>b & a++>c);
        System.out.println(a);

    }
}

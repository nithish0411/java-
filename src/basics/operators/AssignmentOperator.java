package basics.operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        a+= 5;
        b-= 5;
        System.out.println(a);
        System.out.println(b);
        short x = 10;
        short y = 20;
        x+= y; // now x is int typecasting takes place if we need it in short x=(short) x+y
        System.out.println(x);

    }
}

package basics.operators;

public class UnaryOperator {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x++); // print the value then increases x=10 ,
        // prints 10 then its value increases by 1 , x=11
        System.out.println(++x); // increases by one then print x=11+1
        // prints 12
        System.out.println(x--);
        System.out.println(--x);

        int a = 10;
        int b = 10;
        System.out.println(a++ + ++a); // 10 + (11+1) = 22
//        System.out.println(++b + b++); // 11 + 11 = 22
        System.out.println(b++ + b++); // 10 +11 = 21
    }
}

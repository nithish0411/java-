package basics.operators;

public class ShiftOperators {
    public static void main(String[] args) {
        // left shift
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<5);// 10 * 2^5 = 320
        // right shift
        System.out.println(10>>2); // 10/2^2
        System.out.println(10>>5); // 10/2^5
        // >> vs >>>
        // positive number works as the same
        System.out.println(10>>2);
        System.out.println(10>>>2);
        // for negative numbers
        System.out.println(-10>>2);
        System.out.println(-10>>>2);
    }
}

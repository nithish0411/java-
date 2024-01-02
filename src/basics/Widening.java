package basics;

public class Widening {
    public static void main(String[] args) {
        int a = 10;
        float f = a;
        System.out.println("a = " + a); // 10
        System.out.println("f = " + f);// 10.0 (widening)
    }
}

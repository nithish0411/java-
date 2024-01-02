package basics;

public class TypeCasting {//narrowing

    public static void main(String[] args) {
        float f = 10.5f;
        int i = (int) f;
        System.out.println("f = " + f); // 10.5
        System.out.println("i = " + i); // 10 (narrowing)
    }
}

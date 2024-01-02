package basics;

public class VariableOverflow {
    public static void main(String[] args) {
        int a = 130;
        byte b = (byte) a;
        System.out.println("a = " + a); // 130
        System.out.println("b = " + b); // -126
        System.out.println(a % 256);
        // byte range =(-128 to 127) 256 , 256 % a = a
        // so 256-a = 126 - symbol refers overflow

        byte c = 34;
        byte d = 20;
        System.out.println(c+d);
        byte e = (byte) (c+d);
        System.out.println("e = " + e);
        /*
            If any operand is long, the result is long.
            If any operand is float, the result is float.
            If any operand is double, the result is double.
            Otherwise, the result is int (or a widened type if needed).
        */
    }
}

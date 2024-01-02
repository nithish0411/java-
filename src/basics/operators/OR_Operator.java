package basics.operators;

public class OR_Operator {
    public static void main(String[] args) {
        // logical || operator don't check the 2nd condition , if the 1st one false
        // bitwise | operator  check the 2nd condition , if the 1st one false
        int a = 5;
        int b = 10;
        //logical operator
        System.out.println(a>b || a++>b);
        System.out.println(a);
        //bitwise operator
        System.out.println(a>b | a++>b);
        System.out.println(a);
    }
}

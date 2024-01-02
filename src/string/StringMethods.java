package string;

import basics.operators.ShiftOperators;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String s = "nithish";
        //length()
        System.out.println(s.length());
        //charAt()
        System.out.println(s.charAt(3));
        //substring()
        System.out.println(s.substring(2,4));
        System.out.println(s.substring(2));
        // contains()
        System.out.println(s.contains("th"));
        // equals() - both strings are equal ?
        String s2 = "pavithra";
        System.out.println(s.equals(s2));
        String s3 = " NITHISH";
        System.out.println(s.equals(s3));
        //concat
         s3 = s2.concat(s3);
        System.out.println(s3);

        // replace
        System.out.println(s3.replace("th","vi"));
        // equalIgnoreCase()
        String java = "java is fast";
        String  python = "JAVA IS FAST";
        System.out.println(java.equalsIgnoreCase(python));
        // indexOf
        System.out.println(java.indexOf("is"));
        String c = "java is fast , python is slower than java .";
        System.out.println(c.indexOf("is",6));
        //toLowerCase()
        System.out.println(c.toLowerCase());
        //toUpperCase()
        System.out.println(c.toUpperCase());
        // valueOf()
        int a = 20;
        System.out.println(a+10);//addition
        System.out.println(String.valueOf(a)+10);// concatenation


    }
}

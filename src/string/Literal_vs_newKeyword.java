package string;

public class Literal_vs_newKeyword {
    public static void main(String[] args) {
        // just a literal values
        String s1 = "nithish";
        String s2 = "nithish";
        System.out.println(s1 == s2);
//2 different objects
        String s3 = new String("raman");
        String s4 = new String("raman");
        System.out.println(s3 == s4);
    }
}

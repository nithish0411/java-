package string;

public class StringClass {
    public static void main(String[] args) {
        char[] ch  = {'n','i','t','h','i','s','h'};
        String s = new String(ch);
        System.out.println(s);
        //same as
        String str = "nithish";
        System.out.println("str = " + str);
    }
}

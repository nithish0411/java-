package string;

import java.util.Scanner;

public class Piglatin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = in.nextLine().toLowerCase();
        int i ;
        for(i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                break;
            }
        }
        System.out.println(i);
        String m = s.substring(i);
        System.out.println(m);
        String n = s.substring(0,i);
        System.out.println(n);
        s = m + n +"ay";
        System.out.println(s);
    }
}

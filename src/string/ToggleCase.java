package string;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        System.out.println("enter the string : ");
        Scanner in = new Scanner(System.in);
        String  s = in.nextLine();
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)){
                resultString.append((Character.toUpperCase(ch)));
            }else resultString.append((Character.toLowerCase(ch)));
        }
        System.out.println(resultString);
    }
}

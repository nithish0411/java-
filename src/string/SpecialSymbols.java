package string;

import java.util.Scanner;

public class SpecialSymbols {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string : ");
        String  string = in.nextLine();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (!Character.isAlphabetic(ch) && !Character.isDigit(ch)){
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}

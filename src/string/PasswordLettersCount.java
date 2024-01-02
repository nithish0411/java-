package string;

import java.util.Scanner;

public class PasswordLettersCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = in.nextLine();
        int lCount = 0;
        int uCount = 0;
        int sCount = 0;
        int dCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) dCount++;
            else if (Character.isAlphabetic(ch)) {
                if (Character.isUpperCase(ch)){
                    uCount++;
                }else lCount++;
            }else sCount++;
        }

        System.out.println("dCount = " + dCount);
        System.out.println("sCount = " + sCount);
        System.out.println("uCount = " + uCount);
        System.out.println("lCount = " + lCount);
    }
}

package string;

import java.util.Scanner;

public class CountTheVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the string : ");
        String a = in.nextLine();
        int vCount = 0;
        int cCount = 0;
        int whiteSpace = 0;
        for (int i = 0; i < a.length() ; i++) {
            char ch = a.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vCount++;
            }else if (ch == ' '){
                whiteSpace++;
            }else cCount++;

        }
        System.out.println("cCount = " + cCount);
        System.out.println("vCount = " + vCount);
        System.out.println("whiteSpace = " + whiteSpace);
        // another method
         vCount = 0;
         cCount = 0;
         whiteSpace = 0;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isAlphabetic(ch)){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vCount++;
                }else cCount++;
            }
            if (Character.isWhitespace(ch)){
                whiteSpace++;
            }
        }
        System.out.println("cCount = " + cCount);
        System.out.println("vCount = " + vCount);
        System.out.println("whiteSpace = " + whiteSpace);
    }

}

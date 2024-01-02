package string;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string : ");
        String string = in.nextLine();
        StringBuilder reverse = new StringBuilder(string).reverse();
        if (reverse.toString().equals(string)){
            System.out.println(string +" is palindrome");
        }else System.out.println(string +" is not a palindrome");
    }
}

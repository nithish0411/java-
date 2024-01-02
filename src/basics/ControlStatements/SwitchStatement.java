package basics.ControlStatements;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a day : ");
        String choice = in.next().toLowerCase();
        switch (choice){
            case "sunday":
                System.out.println("have a nice day ");
                break;
            case "monday":
                System.out.println("it's a working day ");
                break;
            case "friday":
                System.out.println("enjoy the weekend");
            default:
                System.out.println("boring working days ...");
        }
    }
}

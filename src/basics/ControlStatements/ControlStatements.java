package basics.ControlStatements;

public class ControlStatements {
    public static void main(String[] args) {
        /*
    Decision-Making statements
        if statements
        switch statement
    Loop statements
        do while loop
        for loop
        for-each loop
    Jump statements
        break statement
        continue statement

         */

        //simple if
        int x = 10;
        int y = 20;
//        if (x<y){
//            System.out.println("y is greater than x ");
//        }

        // if-else statement
//        if (x<y){
//            System.out.println("y is greater than x ");
//        }else System.out.println("x is greater than y ");

        // if else ladder
//        if (x==y){
//            System.out.println("both are equal ");
//        } else if (x<y) {
//            System.out.println("y is greater than x ");
//        }else System.out.println("x is greater than y");
        // nested if else
        if (!(x==y)){
            if (x<y){
                System.out.println("y is greater than x ");
            }else System.out.println("x is greater than y ");
        }
    }
}

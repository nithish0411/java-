 package basics.ControlStatements;

public class Forloop {
    public static void main(String[] args) {
        //for loop
        int sum=0;
        for (int i = 1; i <= 10; i++) {
            sum+=i;
        }
        System.out.println("sum = " + sum);

        //for each loop
        String[] array = {"java","compiler design","python","spring boot","networking","5G-technology"};
        System.out.println("yours learnings are : ");
        for (String x:array
             ) {
            System.out.println(x);
        }
        // while loop , if you don't know the exact iteration go for it
        int i = 1;
//        while (i<=10){
//            System.out.println(i);
//            i+=2;
//        }
        // do while loop
        do {
            System.out.println(i);
            i++;
        }while (i<=10);
    }
}

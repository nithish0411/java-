package basics;

public class Variables {
     int x=9;// instance variable
     static int z= 23; // static variable
    public static void main(String[] args) {
        // a variable is the container ,
        // that holds the value , while the java program executed
        int data = 50; // data is variable

        // there are 3 types of variables
        /*
        local variable
        instance variable
        static variable
        */
        //A local variable cannot be defined with "static" keyword.
        Variables obj = new Variables();
        obj.run();
        Variables obj1 = new Variables();
        obj1.x=80;
        obj1.run();

    }
    void run(){
        int y=4; //local variable
        System.out.println(x+y+z);
    }
}

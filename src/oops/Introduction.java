package oops;

public class Introduction {
    public static void main(String[] args) {
        // stores a 5 students roll number
        int[] rollNumber = new int[5];
        // stores a 5 students names
        String[] names = new String[5];
        // data of 5 students (name, roll number , marks)
        int[] roll_no = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
        Student student1 ;
        // we cannot print this directly
//        System.out.println(Arrays.toString(students));
        // by default students are null
        Student nithii = new Student(29,"Nithish kumar ",92.4f);
        Student raman = new Student(nithii);
        Student pavithra = new Student();
//        raman.marks = 89.5f;
//        raman.name = "raman";
//        raman.roll_no = 21;
//        System.out.println("name is : "+ raman.name);
//        System.out.println("mark is : "+ raman.marks);
//        System.out.println("roll number is : "+raman.roll_no);

        nithii.greeting();
        raman.greeting();
        pavithra.greeting();
    }
}
// create class
class Student{
    int roll_no ;
    String name;
    float marks;
    // class - logical construct
    // object - physical reality


//    we need a way to add the values of the above
//    properties object by object
    // we need one word to access every object
//    Student(){
//        this.roll_no = 13;
//        this.name = "raman";
//        this.marks = 89.5f;
//    }
    Student(int roll_no,String name,float marks){
        this.name = name;
        this.marks = marks;
        this.roll_no = roll_no;
    }
    Student(Student other){
        this.name = other.name;
        this.marks = other.marks;
        this.roll_no = other.roll_no;
    }
    // calling a constructor from another constructor
    Student(){

        //internally is something like new Student()
        this(31,"Pavithra",97.5f);
    }
    void greeting(){
        System.out.println("hello , my name is "+ this. name);
    }
}

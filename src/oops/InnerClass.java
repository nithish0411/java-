package oops;
// the outside class is cannot be static
public class InnerClass {
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("nithish");
        Test b = new Test("raman");
        System.out.println(b);

//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}

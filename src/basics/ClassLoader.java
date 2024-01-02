package basics;

public class ClassLoader {
    public static void main(String[] args) {
            Class<ClassLoader> c =  ClassLoader.class;
        System.out.println(c.getClassLoader());
        System.out.println(String.class.getClassLoader());
    }
}

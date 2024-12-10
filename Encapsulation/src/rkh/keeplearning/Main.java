package rkh.keeplearning;

public class Main {
    
    public static void main(String[] args) {

        Person rkh = new Person();
        System.out.println(rkh);

        Person mlk = new Person("Malik", 17, "Male");
        System.out.println(mlk);
        mlk.setAge(-11);
        System.out.println(mlk);
    }

}

package fun.learning;

import fun.learning.staticTest.StaticTest;

public class App {

    public static void main(String [] args) {
        System.out.println("Test1 = " + StaticTest.getStatVar());

        StaticTest.setStatVar(23);

        System.out.println("Test2 = " + StaticTest.getStatVar());
    }
    
}

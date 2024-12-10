package fun.learning.staticTest;

public class StaticTest {
   
    private static int StatVar = 0;

    public static int getStatVar() {
        return StatVar;
    }

    public static void setStatVar(int statVar) {
        StaticTest.StatVar = statVar;
    }

}

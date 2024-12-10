package fun.learning;

import fun.learning.cafe.WorkTime;

public class Retail {
    
    public static void main(String [] args) {
        WorkTime workTime = new WorkTime();
        workTime.getOpen().test();
        System.out.println(workTime.getOpen().WorkingTime("Open"));
        if(workTime.getOpen().WorkingTime("Closed")) {
            System.out.println("Time to Work");
        } else {
            System.out.println("Time to go home");
        }
    }

}

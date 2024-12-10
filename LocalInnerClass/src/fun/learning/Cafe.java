package fun.learning;

import java.time.LocalTime;

import fun.learning.cafe.WorkingHours;

public class Cafe {
    public static void main(String [] args) {
        WorkingHours workTime = new WorkingHours();
        LocalTime time = LocalTime.now();
        System.out.println(workTime.isOpenTime(time));
    }   
}

package fun.learning.cafe;

import java.time.LocalTime;

public class WorkingHours {

    public boolean isOpenTime(LocalTime time) {

        class workTime {
            public boolean isOpenTime(LocalTime time) {
                if(time.isAfter(LocalTime.of(8,0)) && time.isBefore(LocalTime.of(17,0))) {
                    return true;
                } else {
                return false;
                }
            }
        }
        return new workTime().isOpenTime(time);
    }    
}

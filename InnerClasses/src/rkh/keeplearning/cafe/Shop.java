package rkh.keeplearning.cafe;

public class Shop {
    
    private WorkTime workTime;

    public Shop() {
        workTime = new WorkTime(true);
    }

    public WorkTime getWorkTime() {
        return workTime;
    }

    public void timeStatus() {
        if(workTime.isOpenTime()) {
            System.out.println("Open Hours");
        } else {
            System.out.println("Closed Hours");
        }
    }

    public class WorkTime {
        
        private boolean workTime;

        public WorkTime(boolean workTime) {
            this.workTime = workTime;
        }

        public boolean isOpenTime() {
            return workTime;
        }

        public void setWorkTime(boolean workTime) {
            this.workTime = workTime;
        }
    }

}

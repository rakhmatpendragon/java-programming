package fun.learning.cafe;

public class WorkTime {
    
    Open open = new Open() {

        @Override
        public boolean WorkingTime(String sign) {
            if(sign.equals("Open")) {
                return true;
            } else {
                return false;
            }
        }
        
    };

    public Open getOpen() {
        return open;
    }

}

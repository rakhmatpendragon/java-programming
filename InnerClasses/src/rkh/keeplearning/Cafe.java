package rkh.keeplearning;

import rkh.keeplearning.cafe.Door;
import rkh.keeplearning.cafe.Shop;

public class Cafe {

    public static void main(String[] args) {

        Shop rainCafe = new Shop();
        rainCafe.timeStatus();
        rainCafe.getWorkTime().setWorkTime(false);
        rainCafe.timeStatus();
        
        Door door = new Door();
        door.shopStatus();
        door.getLock().setLock(false);
        door.shopStatus();

    }
    
}

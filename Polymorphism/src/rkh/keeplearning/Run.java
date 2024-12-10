package rkh.keeplearning;

import rkh.keeplearning.smartphones.IphoneMini;
import rkh.keeplearning.smartphones.SamsungGalaxy;
import rkh.keeplearning.smartphones.Smartphones;

public class Run {

    public static void main(String [] args) {

        //First Implementation
        System.out.println("========== First ==========");
        Smartphones samsung = new SamsungGalaxy("Samsung Fold");
        System.out.println(samsung.getModel());
        samsung.features();

        Smartphones iphone = new IphoneMini("Iphone Pro Max");
        System.out.println(iphone.getModel());
        iphone.features();

        //Second Implementation
        System.out.println("\n" + "========== Second ==========");
        Smartphones smart1 = new Run().smartphone(1);
        System.out.println(smart1.getModel());
        smart1.features();

        Smartphones smart2 = new Run().smartphone(2);
        System.out.println(smart2.getModel());
        smart2.features();
    }

    public Smartphones smartphone(int choose) {

        switch(choose) {
            case 1: return new IphoneMini("Premium Phone");
            case 2: return new SamsungGalaxy("Affordable Phone");
        }

        return null;
    }
    
}

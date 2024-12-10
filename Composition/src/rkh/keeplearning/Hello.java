package rkh.keeplearning;

import rkh.keeplearning.smartphone.Smartphone;
import rkh.keeplearning.smartphone.components.Body;
import rkh.keeplearning.smartphone.components.Chipset;

public class Hello {

    public static void main(String[] args) {

        //First Implementation
        Smartphone ROG7 = new Smartphone();
        System.out.println("============ First ================");
        System.out.println(ROG7);
        System.out.println(ROG7.getDisplay());
        System.out.println(ROG7.getBody().getWaterResistance());
        System.out.println(ROG7.getChipset().getSeries());

        //Second Implementation
        Body body = new Body("Alumunium", 163.4f, 78.1f, 8.9f, "Gorilla Glass Victus 2", false);
        Chipset chipset = new Chipset("Qualcomm Snapdragon", "Octa-core", "Adreno 740", "Qualcomm SM8550-AC Snapdragon 8 Gen 2 (4nm)");
        Smartphone SamsungS23 = new Smartphone(body, "Dynamic AMOLED", chipset, "256GB 8GB", "Andorid 13", "200 MP", "12 MP"
        , "Li-Ion 5000 mAh");
        System.out.println("\n" + "============== Second ===============");
        System.out.println(SamsungS23);

        //Add Functionality
        System.out.println("\n" + "================== Update Value =================");
        SamsungS23.upgradeMode();
        System.out.println("Build Up Mode");
        System.out.println("Water Resistance: " + SamsungS23.getBody().getWaterResistance());
    }
}
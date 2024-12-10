package rkh.keeplearning;

import rkh.keeplearning.smartphones.GalaxyFold;
import rkh.keeplearning.smartphones.Smartphone;

public class Main {

    public static void main(String[] args) {

        Smartphone smartphone = new GalaxyFold();
        String chipset = smartphone.chipset();
        int memory = smartphone.memory();
        System.out.println("Processor :" + chipset);
        System.out.println("Memory :" + memory);

    }
    
}

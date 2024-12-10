package rkh.keeplearning.smartphones;

public class Iphone implements Smartphone{

    @Override
    public String chipset() {
        return "A13";
    }

    @Override
    public int memory() {
        return 128;
    }

    @Override
    public String OS() {
        return "IOS 11";
    }
    
}

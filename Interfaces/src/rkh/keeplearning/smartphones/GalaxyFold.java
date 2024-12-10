package rkh.keeplearning.smartphones;

public class GalaxyFold implements Smartphone {

    @Override
    public String chipset() {
        return "Snapdragon 855";
    }

    @Override
    public int memory() {
        return 128;
    }

    @Override
    public String OS() {
        return "Android";
    }
    
}

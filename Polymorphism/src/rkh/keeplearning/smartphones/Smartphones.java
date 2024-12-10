package rkh.keeplearning.smartphones;

public class Smartphones {
    
    private String model;
    
    /*
    public Smartphones() {

    }
     */

    public Smartphones(String model) {
        this.model = model;
    }

    public void features() {
        System.out.println("Feature phone");
    }

    public String getModel() {
        return model;
    }
}

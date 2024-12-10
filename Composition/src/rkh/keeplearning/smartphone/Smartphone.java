package rkh.keeplearning.smartphone;

import rkh.keeplearning.smartphone.components.Body;
import rkh.keeplearning.smartphone.components.Chipset;

public class Smartphone {

    private Body body;
    private String display;
    private Chipset chipset;
    private String memory;
    private String software;
    private String frontCamera;
    private String rearCamera;
    private String battery;

    public Smartphone() {

        this.body = new Body();
        this.display = "6.78 AMOLED";
        this.chipset = new Chipset();
        this.memory = "512GB 16GB RAM";
        this.software = "Android 13";
        this.frontCamera = "32 MP";
        this.rearCamera = "50 MP";
        this.battery = "6000mAh";

    }

    public Smartphone(Body body, String display, Chipset chipset, String memory, String software, String frontCamera, String rearCamera, String battery) {

        this.body = body;
        this.display = display;
        this.chipset = chipset;
        this.memory = memory;
        this.software = software;
        this.frontCamera = frontCamera;
        this.rearCamera = rearCamera;
        this.battery = battery;

    }

    @Override
    public String toString() {
        return "Smartphone [body=" + body + ", display=" + display + ", chipset=" + chipset + ", memory=" + memory + ", software=" + software + ", frontCamera=" + frontCamera
        + ", rearCamera=" + rearCamera + ", battery=" + battery + "]";
    }

    public Body getBody() {
        return body;
    }
    
    public String getDisplay() {
        return display;
    }

    public Chipset getChipset() {
        return chipset;
    }

    public String getMemory() {
        return memory;
    }

    public String getSoftware() {
        return software;
    }

    public String getFrontCamera() {
        return frontCamera;
    }

    public String getRearCamera() {
        return rearCamera;
    }

    public String getBattery() {
        return battery;
    }

    public String upgradeMode() {
        body.setWaterResistance(true);
        return "Success";
    }
}
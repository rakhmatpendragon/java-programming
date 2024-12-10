package rkh.keeplearning.smartphone.components;

public class Chipset {

    private String brand;
    private String core;
    private String name;
    private String series;

    public Chipset() {

        this.brand = "Qualcomm Snapdragon";
        this.core = "Octa core";
        this.name = "Adreno 740";
        this.series = "Qualcomm SM8550-AB Snapdragon 8 Gen 2";

    }

    public Chipset(String brand, String core, String name, String series) {
        
        this.brand = brand;
        this.core = core;
        this.name = name;
        this.series = series;

    }

    @Override
    public String toString() {
        return "Chipset [brand=" + brand + ", core=" + core + ", name=" + name + ", series=" + series + "]";
    }
    
    public String getBrand() {
        return brand;
    }

    public String getCore() {
        return core;
    }

    public String getName() {
        return name;
    }

    public String getSeries() {
        return series;
    }
}
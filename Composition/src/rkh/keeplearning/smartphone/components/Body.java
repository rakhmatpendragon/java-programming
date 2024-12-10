package rkh.keeplearning.smartphone.components;

public class Body {

    private String frame;
    private float length;
    private float width;
    private float height;
    private String screen;
    private boolean waterResistance;

    public Body() {

        this.frame = "Alumunium";
        this.length = 173.0f;
        this.width = 77.0f;
        this.height = 10.3f;
        this.screen = "Gorilla Glass";
        this.waterResistance = true;

    }

    public Body(String frame, float length, float width, float height, String screen, boolean waterResistance) {

        super();
        this.frame = frame;
        this.length = length;
        this.width = width;
        this.height = height;
        this.screen = screen;
        this.waterResistance = waterResistance;

    }
    
    @Override
    public String toString() {
        return "Body [frame=" + frame + ", length=" + length + ", widht=" + width + ", height=" + height + ", screen=" + screen + ", waterResistance=" + waterResistance + "]";
    }

    public String getFrame() {
        return frame;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public String getScreen() {
        return screen;
    }

    public boolean getWaterResistance() {
        return waterResistance;
    }
 
    public void setWaterResistance(boolean waterResistance) {
        this.waterResistance = waterResistance;
    }
    
}
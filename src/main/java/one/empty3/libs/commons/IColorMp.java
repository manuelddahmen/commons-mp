package one.empty3.libs.commons;

public class IColorMp {
    private int color;

    public IColorMp(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setRGB(int r, int g, int b) {
        this.color = r*256*256+g*256+b;
    }
    public void setRGB(int rgb) {
        this.color = rgb;
    }
    public int getRGB() {
        return color;
    }
    public int getRed() {
        return color/256/256;
    }
    public int getGreen() {
        return color/256%256;
    }
    public int getBlue() {
        return color%256;
    }
}

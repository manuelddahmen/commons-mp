package one.empty3.libs.commons;

public class IImageMp {
    int [][] imagetoMatrix;

    public void setImageToMatrix(int[][] imagetoMatrix) {
        this.imagetoMatrix = imagetoMatrix;
    }
    public int[][] getMatrix() {
        return imagetoMatrix;
    }
    public int getWidth() {
        return imagetoMatrix[0].length;
    }
    public int getHeight() {
        return imagetoMatrix.length;
    }

    public void setRgb(int x, int y, int rgb) {
        imagetoMatrix[y][x] = rgb;
    }
    public int getRgb(int x, int y) {
        return imagetoMatrix[y][x];
    }

}

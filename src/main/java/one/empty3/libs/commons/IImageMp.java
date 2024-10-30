package one.empty3.libs.commons;

public interface IImageMp {
    int [][] imagetoMatrix = new int[1][1];

    public void setImageToMatrix(int[][] imagetoMatrix);

    public int[][] getMatrix();

    public int getWidth();

    public int getHeight();

    public void setRgb(int x, int y, int rgb);

    public int getRgb(int x, int y);

}

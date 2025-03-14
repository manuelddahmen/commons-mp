package one.empty3.libs.commons;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

public interface IImageMp {
    int [][] imagetoMatrix = new int[1][1];

    public void setImageToMatrix(int[][] imagetoMatrix);

    public int[][] getMatrix();

    public void setRgb(int x, int y, int rgb);

    public int getRgb(int x, int y);

    public static IImageMp getFromFile(File file) {
        return null;
    }
    public static IImageMp getFromInputStream(InputStream stream) {
        return null;
    }
    public boolean toOutputStream(OutputStream stream);

    public static IImageMp loadFile(File path) {
        return null;
    }

    public boolean saveToFile(String path);

    public int getWidth();

    public int getHeight();
}

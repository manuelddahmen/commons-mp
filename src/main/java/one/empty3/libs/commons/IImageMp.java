package one.empty3.libs.commons;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface IImageMp {
    int [][] imagetoMatrix = new int[1][1];

    public void setImageToMatrix(int[][] imagetoMatrix);

    
    public int[][] getMatrix();

    public void setRgb(int x, int y, int rgb);

    public int getRgb(int x, int y);

    public static IImageMp getFromFile(File file) throws IOException {
        return null;
    }
    public static IImageMp getFromInputStream(InputStream stream) throws IOException {
        return null;
    }
    public boolean toOutputStream(OutputStream stream) throws IOException;

    public static IImageMp loadFile(File path) throws IOException {
        return null;
    }

    public boolean saveToFile(String path) throws IOException;

    public int getWidth();

    public int getHeight();
}

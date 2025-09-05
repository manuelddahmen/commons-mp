package one.empty3.libs.commons;

import java.awt.image.BufferedImage;
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

    public static boolean saveFileAs(BufferedImage image, String type, File out,
                                     boolean shouldOverwrite) {
        return false;
    }

    public boolean saveToFile(String path) throws IOException;
    public boolean saveFile(File path) throws IOException;

    public int getWidth();

    public int getHeight();
}

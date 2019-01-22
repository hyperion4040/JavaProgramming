package edu;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class UserImage {

    private BufferedImage bufferedImage;
    private File file;


    public int getRGB(int x, int y) {
        return bufferedImage.getRGB(x,y);
    }

    public int getWidth() {
        return width;

    }

    public int getHeight() {
        return height;
    }

    private int width;
    private int height;


    public UserImage(File file) {


        bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        width = bufferedImage.getWidth();
            height = bufferedImage.getHeight();

    }
}

package com.hinhyuga.watermark.utils;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * FileUtils
 */
public class FileUtils {
    public static void main(String[] args) {
        File file = new File("/Users/bryan/Desktop/bryan/io/meinv.jpeg");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            Image read = ImageIO.read(file);
            int width = read.getWidth(null);//宽
            int height = read.getHeight(null);//高
            BufferedImage bufferedImage = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics = bufferedImage.createGraphics();
            graphics.drawImage(read,0,0,width,height,null);
            graphics.setColor(Color.RED);
            graphics.drawString("测试一个",50,50);
            graphics.dispose();
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/bryan/Desktop/bryan/io/meinv3.jpeg");
            ImageIO.write(bufferedImage,"jpeg",fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * yes or on image format
     * @return
     */
    public static boolean isImage(String imageName){
        return false;
    }
}

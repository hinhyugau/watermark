package com.hinhyuga.watermark.utils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FileUtils
 */
public class FileUtils {

     /*
     * yes or on image format
     * @return
     */
    public static boolean isImage(String imageName){
        boolean falg = false;
        List<String> imageSufferNamesList = new ArrayList<>();
        imageSufferNamesList.add("jpg");
        imageSufferNamesList.add("jpeg");
        imageSufferNamesList.add("png");
        imageSufferNamesList.add("webp");
        imageSufferNamesList.add("gif");
        imageSufferNamesList.add("bmp");
        String[] iamgeSufferNames = imageName.split("\\.");
        String imageSufferName = iamgeSufferNames[iamgeSufferNames.length-1];
        if (imageSufferNamesList.contains(imageSufferName)){
            falg = true;
        }
        return falg;
    }

    /**
     * 
     * @return
     * @throws IOException
     */
    public static BufferedImage geneTextImage(String waterText,String waterTextColor) throws IOException {
        int imageWidth = 200;
        int imageHeight = 200;
        BufferedImage bufferedImage = new BufferedImage(imageWidth,imageHeight,BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = bufferedImage.createGraphics();
        bufferedImage = graphics.getDeviceConfiguration().createCompatibleImage(imageWidth, imageHeight, Transparency.TRANSLUCENT);
        graphics.dispose();
        graphics = bufferedImage.createGraphics();
        // Drawing BasicStroke is a basic pen class provided in JDK, we set the thickness of the pen, and then we can draw any graphics we want on drawPanel.
        graphics.setColor(watrerTextColor(waterTextColor));
        graphics.setStroke(new BasicStroke(1f));
        graphics.setFont(new Font("Arial",Font.PLAIN,30));
        graphics.drawString(waterText,imageWidth/2,imageHeight/2);
        graphics.drawImage(bufferedImage,0,0,null);
        graphics.dispose();
        return bufferedImage;
    }

    /**
     * choose water text color
     * @param waterText
     * @return
     */
    public static Color watrerTextColor(String waterText){
        switch (waterText){
            case "WHITE":
                return Color.WHITE;
            case "LIGHT_GRAY":
                return Color.LIGHT_GRAY;
            case "GRAY":
                return Color.GRAY;
            case "DARK_GRAY":
                return Color.DARK_GRAY;
            case "BLACK":
                return Color.BLACK;
            case "RED":
                return Color.RED;
            case "PINK":
                return Color.PINK;
            case "ORANGE":
                return Color.ORANGE;
            case "YELLOW":
                return Color.YELLOW;
            case "GREEN":
                return Color.GREEN;
            case "MAGENTA":
                return Color.MAGENTA;
            case "CYAN":
                return Color.CYAN;
            default:
                return Color.BLUE;
        }
    }
}

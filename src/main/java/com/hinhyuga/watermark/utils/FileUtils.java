package com.hinhyuga.watermark.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * FileUtils
 */
public class FileUtils {
    /**
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
}

package com.hinhyuga.watermark.web;

import com.hinhyuga.watermark.pojo.Image;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping("image")
public class ImageController {



    @RequestMapping(value = "imageOld",produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] postImage(@RequestParam("images") MultipartFile[] multipartFiles,Image image){
        byte[] returnBytes = new byte[multipartFiles.length];
        int count = 0;
        for (MultipartFile multipartFile : multipartFiles) {
            try {
                byte[] bytes = multipartFile.getBytes();
                InputStream inputStream = multipartFile.getInputStream();
                BufferedImage read = ImageIO.read(inputStream);
                int width = read.getWidth();
                int height = read.getHeight();

                Graphics2D graphics = read.createGraphics();
                graphics.drawImage(read,0,0,width,height,null);
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
                        RenderingHints.VALUE_STROKE_NORMALIZE);
                graphics.setRenderingHint(RenderingHints.KEY_RENDERING,
                        RenderingHints.VALUE_RENDER_QUALITY);
//                graphics.drawImage(read,50,50,null);

                graphics.drawString("cesik",50,50);

                return bytes;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            return null;
    }
}

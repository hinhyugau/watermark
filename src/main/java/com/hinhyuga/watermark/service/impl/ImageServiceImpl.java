package com.hinhyuga.watermark.service.impl;

import com.hinhyuga.watermark.pojo.Image;
import com.hinhyuga.watermark.service.ImageService;
import com.hinhyuga.watermark.utils.FileUtils;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Position;
import net.coobird.thumbnailator.geometry.Positions;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Service
public class ImageServiceImpl implements ImageService {
    @Override
    public boolean addImageWater(MultipartFile[] files, MultipartFile fileTar,Image image) throws IOException {
        BufferedImage BufferTar = ImageIO.read(fileTar.getInputStream());
        String waterTextLocal = image.getWaterTextLocal();
        Positions[] values = Positions.values();
        String s = null;
        for (Positions value : values) {
            s = value.toString();
        }
        for (MultipartFile file : files) {
            if (FileUtils.isImage(file.getOriginalFilename())){
               BufferedImage imageBuffer =  ImageIO.read(file.getInputStream());

                Thumbnails.of(imageBuffer)
                        .size(imageBuffer.getWidth(),imageBuffer.getHeight())
                .watermark(Positions.valueOf(s),
                        BufferTar
                        ,image.getTransp())
                        .toFile(new File("/Users/bryan/Desktop/bryan/io/meinv55.jpeg"));
            }
        }
        return false;
    }
}
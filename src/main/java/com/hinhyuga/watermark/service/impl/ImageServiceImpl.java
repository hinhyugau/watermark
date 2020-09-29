package com.hinhyuga.watermark.service.impl;

import com.hinhyuga.watermark.pojo.Image;
import com.hinhyuga.watermark.service.ImageService;
import com.hinhyuga.watermark.utils.FileUtils;
import com.hinhyuga.watermark.utils.ServiceException;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@Service
public class ImageServiceImpl implements ImageService {
    @Override
    public boolean addImageWater(MultipartFile[] files, MultipartFile fileTar,Image image){
        try {
            BufferedImage BufferTar = ImageIO.read(fileTar.getInputStream());
            String waterTextLocal = image.getWaterTextLocal();
            Positions[] values = Positions.values();
            String positionLoca = null;
            for (Positions value : values) {
                if (StringUtils.isNotBlank(waterTextLocal) && waterTextLocal.equalsIgnoreCase(value.toString())){
                    positionLoca = value.toString();
                }
            }
            for (MultipartFile file : files) {
                if (FileUtils.isImage(file.getOriginalFilename())){
                   BufferedImage imageBuffer =  ImageIO.read(file.getInputStream());

                    Thumbnails.of(imageBuffer)
                            .size(imageBuffer.getWidth(),imageBuffer.getHeight())
                    .watermark(Positions.valueOf(positionLoca),
                            BufferTar
                            ,image.getTransp())
                            .toFile(new File("/Users/bryan/Desktop/bryan/io/meinv55.jpeg"));
                }
            }
        }
        catch (ServiceException e){
            throw new ServiceException("image add water error"+e.getMessage());
        }catch (IOException e){
            e.getMessage();
        }
        return false;
    }
}

package com.hinhyuga.watermark.service;

import com.hinhyuga.watermark.pojo.Image;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ImageService {
     boolean addImageWater(MultipartFile[] files, MultipartFile file,Image image) throws IOException;
}

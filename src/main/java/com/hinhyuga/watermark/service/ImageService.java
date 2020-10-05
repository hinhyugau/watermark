package com.hinhyuga.watermark.service;

import com.hinhyuga.watermark.pojo.Image;
import com.hinhyuga.watermark.utils.ServiceException;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
     boolean addImageWater(MultipartFile[] files,Image image) throws ServiceException;
}

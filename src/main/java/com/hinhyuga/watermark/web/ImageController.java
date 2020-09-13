package com.hinhyuga.watermark.web;

import com.hinhyuga.watermark.pojo.Image;
import com.hinhyuga.watermark.utils.ReturnMsgUtil;
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



    @RequestMapping(value = "imageOld")
    @ResponseBody
    public ReturnMsgUtil postImage(@RequestParam("images") MultipartFile[] multipartFiles, Image image){
        ReturnMsgUtil returnMsgUtil = new ReturnMsgUtil();
        return returnMsgUtil;
    }
}

package com.hinhyuga.watermark.web;

import com.hinhyuga.watermark.pojo.Image;
import com.hinhyuga.watermark.service.ImageService;
import com.hinhyuga.watermark.utils.ReturnCode;
import com.hinhyuga.watermark.utils.ReturnMsgUtil;
import com.hinhyuga.watermark.utils.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("image")
public class ImageController {

    private Logger logger = LoggerFactory.getLogger(ImageController.class);

    @Autowired
    private ImageService imageService;

    @RequestMapping(value = "addImageWater")
    @ResponseBody
    public ReturnMsgUtil postImage(@RequestParam("imagesSrc") MultipartFile[] multipartFiles,
                                   @RequestParam("imageWater") MultipartFile multipartFile, Image image){
        ReturnMsgUtil returnMsgUtil = new ReturnMsgUtil();
        logger.debug("start water");

        try {
            boolean falg = this.imageService.addImageWater(multipartFiles, multipartFile,image);
            returnMsgUtil.setMsg("add water success!");
            returnMsgUtil.setCode(ReturnCode.SUCCESS.getValue());
        } catch (ServiceException e) {
            returnMsgUtil.setCode(ReturnCode.FAILED.getValue());
            returnMsgUtil.setMsg("add water error!");
        }

        return returnMsgUtil;
    }
}

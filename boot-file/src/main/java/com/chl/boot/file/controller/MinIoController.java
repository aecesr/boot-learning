package com.mth.boot.file.controller;

import com.mth.boot.file.utils.MinIoTemplate;
import io.minio.ObjectWriteResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: mth
 * @date: 2022/4/14
 **/
@RestController
public class MinIoController {
    @Resource
    private MinIoTemplate minIoTemplate;

    @PostMapping(value = "/create")
    public String createBucket(String bucketName) throws Exception{
        minIoTemplate.makeBucket(bucketName);
        return "你创建了存储桶：" + bucketName;
    }

    @PostMapping(value = "/upload")
    public String putObject(String bucketName, String objectName, String filepath) throws Exception{
        ObjectWriteResponse response = minIoTemplate.putObject(bucketName,
                objectName,
                filepath);
        return "上传文件：" + response.object() + "http://42.192.1.98:9001/" + bucketName + "/" + objectName;
    }

    @PostMapping(value = "/delete")
    public String deleteObject(String bucketName, String objectName) throws Exception{
        minIoTemplate.removeObject(bucketName,
                objectName);
        return "删除文件：" + objectName;
    }
}

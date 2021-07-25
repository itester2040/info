package com.example.hadoop;


import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.apache.hadoop.conf.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Slf4j
@Controller
@CrossOrigin
public class FileController {

    //@PostMapping("OneController/getFileToHDFS")
    @GetMapping("aa")
    @ResponseBody
    //public void getFileToHDFS(@RequestParam("file") MultipartFile file){
    public String getFileToHDFS(){
        try {
            log.info("log~~~~~~~~~~~~~~~~~~~~~");
            File file = new File("./logs/log-json.log");
            HDFSCommon.copyfileToHdfs(new Configuration(),"hdfs://127.0.0.1:9000", file);
        }
        catch(Exception io)
        {
            io.printStackTrace();
        }
        return "test";
    }
}
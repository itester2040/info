package com.example.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import java.io.File;
import java.net.URI;

public class HDFSCommon {
    static public void copyfileToHdfs(Configuration config, String url, File file)
    {
        try {

            FileSystem fs = FileSystem.get(URI.create(url), config);
            Path src = new Path(file.getPath());
            String name = file.getName();
            // to be uploaded to the target path of hdfs
            Path dst = new Path(url+"/"+name);
            fs.copyFromLocalFile(src, dst);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

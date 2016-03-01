package com.hwz.manager;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by nico on 16/2/26.
 */
@Component
public class FileManager
{
    public String saveFile(String namespace, String filename, String pathPrefix, byte[] data) throws IOException
    {
        String filePath = String.format("%s/%s/%s", pathPrefix, namespace, filename);
        File file = new File(filePath);
        File dir = file.getParentFile();
        if (!dir.exists())
        {
            dir.mkdirs();
        }
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write(data);
        outputStream.flush();
        outputStream.close();

        return filePath;
    }
}

package com.hwz;

import com.hwz.service.FileSaveService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Base64Utils;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml");
        FileSaveService fileSaveService = ctx.getBean("FileSaveService",FileSaveService.class);
        String img = "iVBORw0KGgoAAAANSUhEUgAAAAIAAAADCAYAAAC56t6BAAABfGlDQ1BJQ0MgUHJvZmlsZQAAKJFjYGAqSSwoyGFhYGDIzSspCnJ3UoiIjFJgv8PAzcDDIMRgxSCemFxc4BgQ4MOAE3y7xsAIoi/rgsxK8/x506a1fP4WNq+ZclYlOrj1gQF3SmpxMgMDIweQnZxSnJwLZOcA2TrJBUUlQPYMIFu3vKQAxD4BZIsUAR0IZN8BsdMh7A8gdhKYzcQCVhMS5AxkSwDZAkkQtgaInQ5hW4DYyRmJKUC2B8guiBvAgNPDRcHcwFLXkYC7SQa5OaUwO0ChxZOaFxoMcgcQyzB4MLgwKDCYMxgwWDLoMjiWpFaUgBQ65xdUFmWmZ5QoOAJDNlXBOT+3oLQktUhHwTMvWU9HwcjA0ACkDhRnEKM/B4FNZxQ7jxDLX8jAYKnMwMDcgxBLmsbAsH0PA4PEKYSYyjwGBn5rBoZt5woSixLhDmf8xkKIX5xmbARh8zgxMLDe+///sxoDA/skBoa/E////73o//+/i4H2A+PsQA4AJHdp4IxrEg8AAAAkSURBVAgdY3xzYvJ/xn+cDCwMf38y/Gf4w8D0/iMjw7///xgAs5UNI9VBE1oAAAAASUVORK5CYII=";

        try
        {
            String url = fileSaveService.save("xx","tmp.png",Base64Utils.decodeFromString(img));
            System.out.println(url);
        }
        catch (StorageServiceException e)
        {
            e.printStackTrace();
        }
        System.out.println( "Hello World!" );

        fileSaveService.doDao();

//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysqlJPA");
//        factory.close();
    }


}

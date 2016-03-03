package com.hwz.service_impl;

import com.hwz.bean.Book;
import com.hwz.bean.Project;
import com.hwz.bean.Student;
import com.hwz.manager.FileManager;
import com.hwz.repository.BookRepository;
import com.hwz.repository.ProjectRepository;
import com.hwz.repository.StudentRepository;
import com.hwz.service.FileSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by nico on 16/2/25.
 */

@Component("FileSaveService")
public class FileSaveServiceImpl implements FileSaveService
{
    @Value("${file_prefix}")
    private String pathPrefix;

    @Value("${url_prefix}")
    private String urlPrefix;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private FileManager fileManager;


    public String save(String namespace, String filename, byte[] data)
    {
        String filePath = "";
        try
        {
            filePath =fileManager.saveFile(namespace,filename,pathPrefix,data);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return filePath;

    }

    public void doDao()
    {

        Book book = new Book();
        book.setId("20160302");
        book.setTitle("中文");
        bookRepository.save(book);

        Student student = new Student();
        student.setName("bbbci");
        studentRepository.save(student);

        Project project = new Project();
        project.setName("中文");
        projectRepository.save(project);
        for (Project project1:projectRepository.findAll())
        {
            try
            {
                System.out.println(new String(project1.getName().getBytes(),"UTF-8"));
            }
            catch (UnsupportedEncodingException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(projectRepository.findAll());
    }
}

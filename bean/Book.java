package com.hwz.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by nico on 16/2/25.
 */
@Entity
public class Book implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键生成方式auto(由jpa自动生成)
    private Integer id;

    private String title;

    public Book()
    {}

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
}

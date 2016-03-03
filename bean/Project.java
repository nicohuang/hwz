package com.hwz.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by nico on 16/2/26.
 */
@Entity
@Table(name = "tab_project")
public class Project implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public Project(){}


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}

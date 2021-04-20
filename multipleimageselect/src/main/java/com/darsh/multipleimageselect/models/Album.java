package com.darsh.multipleimageselect.models;

/**
 * Created by Darshan on 4/14/2015.
 */
public class Album {
    public long id;
    public String name;
    public String cover;

    public Album(long id,String name, String cover) {
        this.id = id;
        this.name = name;
        this.cover = cover;
    }
}

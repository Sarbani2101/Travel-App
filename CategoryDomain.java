package com.example.tourismapp.Domain;

public class CategoryDomain {
    private String title;
    private String picpath;

    public CategoryDomain(String title, String picpath) {
        this.title = title;
        this.picpath = picpath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath;
    }
}

package com.example.caller;

import java.security.Principal;

public class Contact {
    private String Name;
    private String Detail;
    private int Image;

    public Contact(){

    }

    public Contact(String name, String detail, int image) {
        Name = name;
        Detail = detail;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public String getDetail() {
        return Detail;
    }

    public int getImage() {
        return Image;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    public void setImage(int image) {
        Image = image;
    }
}

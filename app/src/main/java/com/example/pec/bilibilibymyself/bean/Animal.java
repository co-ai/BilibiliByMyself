package com.example.pec.bilibilibymyself.bean;

public class Animal {
    private int image;
    private String title;
    public Animal(int image,String title){
        this.image = image;
        this.title = title;
    }
    public int getImage(){
        return image;
    }
    public String getTitle(){
        return  title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

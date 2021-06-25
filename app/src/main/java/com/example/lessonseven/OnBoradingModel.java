package com.example.lessonseven;

public class OnBoradingModel {
  String  title, descripton;
    int image;

    public OnBoradingModel(String title, String descripton, int image) {
        this.title = title;
        this.descripton = descripton;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

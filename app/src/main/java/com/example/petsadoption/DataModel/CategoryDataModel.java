package com.example.petsadoption.DataModel;

public class CategoryDataModel {
    int id;
    String petName;
    String petInformation;
    String color;
    int petImage;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetInformation() {
        return petInformation;
    }

    public void setPetInformation(String petInformation) {
        this.petInformation = petInformation;
    }

    public int getPetImage() {
        return petImage;
    }

    public void setPetImage(int petImage) {
        this.petImage = petImage;
    }



}

package com.example.petsadoption.DataModel;

public class AdoptionDataModel {
    int id;
    int petImage;
    String petRate;
    String petName;
    String discription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPetImage() {
        return petImage;
    }

    public void setPetImage(int petImage) {
        this.petImage = petImage;
    }

    public String getPetRate() {
        return petRate;
    }

    public void setPetRate(String petRate) {
        this.petRate = petRate;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}

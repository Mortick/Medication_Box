package com.example.medicationbox;

import java.util.ArrayList;
import java.util.HashMap;
import android.graphics.Bitmap;

public class User{

    private String name;
    private String email;
    public ArrayList<Payment> pmt = new ArrayList<>();
    private String userUID;
    private ArrayList<Perscription> perscriptions;
    private Insurance insurance;
    private ArrayList<Box> shipments = new ArrayList<>();
    private String password;
    private HashMap<String, Bitmap> pictures;

    public User(String name, String email, String userUID)
    {
        this.name = name;
        this.email = email;
        this.userUID = userUID;
        this.perscriptions = new ArrayList<>();
        this.pictures = new HashMap<String, Bitmap>();
	}

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getName() {
        return name;
    }

    public String getEmail() { return email; }

    public String getUID() { return userUID; }

    public Perscription getPerscription(String medName) {
        for (Perscription p : perscriptions) {
            if (medName.equals(p.getMedName())) {
                return p;
            }
        }
        return null;
    }

    public void addPerscription(Perscription perscription) {
        perscriptions.add(perscription);
    }

    public boolean removePerscription(String medName) {
        return perscriptions.remove(medName);
    }

    public HashMap<String, Bitmap> getPictures() {
        return pictures;
    }

    public void setPictures(HashMap<String, Bitmap> pictures) {
        this.pictures = pictures;
    }

    public Bitmap addPicture(String picID, Bitmap picture) {
        pictures.put(picID, picture);
        return pictures.get(picID);
    }

    public Bitmap getPicture(String picID) {
        return pictures.get(picID);
    }

    public Bitmap removePicture(String picID) {
        return pictures.remove(picID);
    }

    public Bitmap changePicture(String picID, Bitmap picture) {
        pictures.put(picID, picture);
        return pictures.get(picID);
    }
}

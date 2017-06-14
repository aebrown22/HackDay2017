package com.example.austin.hackdaytest;

import android.media.Image;

/**
 * Created by Austin on 6/11/17.
 */

public class Athlete {

    private String name;
    private String nameOfPic;
    private String sport;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfPic() {
        return nameOfPic;
    }

    public void setNameOfPic(String nameOfPic) {
        this.nameOfPic = nameOfPic;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public Athlete(String name, String nameOfPic, String sport) {
        this.name = name;
        this.nameOfPic = nameOfPic;
        this.sport = sport;
    }




}

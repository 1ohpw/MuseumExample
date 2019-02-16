package com.wolf.android.museumexample;

public class Exhibit {

    String exhibitName;
    int exhibitPhoto;

    public Exhibit(String exhibitName, int exhibitPhoto) {
        this.exhibitName = exhibitName;
        this.exhibitPhoto = exhibitPhoto;
    }

    public String getExhibitName() {
        return exhibitName;
    }

    public int getExhibitPhoto() {
        return exhibitPhoto;
    }
}

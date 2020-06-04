package com.reyad.cityguide.homeAdapter;

public class MyItem {

    int Featured_image;
    String Featured_title;
    String Featured_Description;

    public MyItem(int featured_image, String featured_title, String featured_Description) {
        Featured_image = featured_image;
        Featured_title = featured_title;
        Featured_Description = featured_Description;
    }


    public int getFeatured_image() {
        return Featured_image;
    }

    public String getFeatured_title() {
        return Featured_title;
    }

    public String getFeatured_Description() {
        return Featured_Description;
    }
}

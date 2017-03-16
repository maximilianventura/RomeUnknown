package com.example.koala.romeunknown;

public class Places {

    // Variables for Street Art and Architecture
    private int mTitle;
    private int mArtist;
    private int mLocation;

    // Variables for Street Art and Architecture
    private int mShopName;
    private int mTimetable;
    private int mAddress;
    private int mDescription;


    /** Image resource ID for place */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    // Method for Street Art and Architecture
    public Places(int title, int artist, int location, int imageResourceId) {
        mTitle = title;
        mArtist = artist;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }

    // Method for Drink and Food
    public Places(int shopName, int description, int timetable, int address, int imageResourceId) {
        mShopName = shopName;
        mDescription = description;
        mTimetable = timetable;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    // Get for Street Art and Architecture
    public int getTitle() {
        return mTitle;
    }

    public int getArtist() {
        return mArtist;
    }

    public int getLocation() {
        return mLocation;
    }


    // Get for Drink and Food
    public int getShopName() {
        return mShopName;
    }

    public int getDescription() {
        return mDescription;
    }

    public int getTimetable() {
        return mTimetable;
    }

    public int getAddress() {
        return mAddress;
    }




    /**
     * Return the image resource ID of the place
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for place
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}

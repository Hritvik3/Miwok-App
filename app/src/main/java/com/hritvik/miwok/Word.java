package com.hritvik.miwok;

public class Word {
    // m represents member variables of the class
private String mDefaultTranslation, mMiwokTranslation;
private int mImageResourceId=NO_IMAGE_PROVIDED;


// We create a constant so if there is no image then by default the resource id will be this constant
private static final int NO_IMAGE_PROVIDED = -1 ;

// an audio resource id
    private int mAudioResourceId;


    // constructor without image for the phrases activity and even if the image is not there then this will work
    public Word(String DefaultTranslation, String MiwokTranslation, int audioResourceId) {
        this.mDefaultTranslation = DefaultTranslation;
        this.mMiwokTranslation = MiwokTranslation;
        this.mAudioResourceId = audioResourceId;

    }

    // second constructor to make add the corresponding images to the list
    public Word(String DefaultTranslation, String MiwokTranslation, int ImageResourceId, int audioResourceId) {
        this.mDefaultTranslation = DefaultTranslation;
        this.mMiwokTranslation = MiwokTranslation;
        this.mImageResourceId = ImageResourceId;
        this.mAudioResourceId = audioResourceId;
    }

    //to get the default translation of the word
    public  String getDefaultTranslation(){
        return  mDefaultTranslation;
    }

    // to get the miwok translation of the word
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    // will return true if the view has image
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    // to get the audio resources
    public int getAudioResourceId() {
        return mAudioResourceId;
    }


}

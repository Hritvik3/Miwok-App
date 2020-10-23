package com.hritvik.miwok;

public class Word {
    // m represents member variables of the class
private String mDefaultTranslation, mMiwokTranslation;

    public Word(String DefaultTranslation, String MiwokTranslation) {
        this.mDefaultTranslation = DefaultTranslation;
        this.mMiwokTranslation = MiwokTranslation;
    }

    //to get the default translation of the word
    public  String getDefaultTranslation(){
        return  mDefaultTranslation;
    }

    // to get the miwok translation of the word
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}

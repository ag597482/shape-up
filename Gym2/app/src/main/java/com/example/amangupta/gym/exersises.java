package com.example.amangupta.gym;

/**
 * Created by AmanGupta on 03-10-2017.
 */

public class exersises {

    private String mExersisename;
    private int mImage1ResourceId;

    public exersises(String Exersisename,int image1ResourceId) {
        mExersisename=Exersisename;
        mImage1ResourceId=image1ResourceId;

    }

   public String getExersise() {return mExersisename;
    }

    public int getImage1ResourceId() {
        return mImage1ResourceId;
    }



}

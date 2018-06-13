package com.bignerdranch.android.photogallery;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by cody on 3/22/2018.
 */

public class GalleryItem {

    @SerializedName("title")
    @Expose
    private String mCaption;
    @SerializedName("id")
    @Expose
    private String mId;
    @SerializedName("url")
    @Expose
    private String mUrl;
    @Override
    public String toString() {
        return mCaption;
    }
    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }



    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }
}

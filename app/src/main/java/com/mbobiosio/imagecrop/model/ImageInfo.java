package com.mbobiosio.imagecrop.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;


/**
 * Created by kodenerd on 8/23/17.
 */

public class ImageInfo implements Parcelable{

    @SerializedName("sender_name")
    private String sender;
    @SerializedName("sender_age")
    private int age;

    public ImageInfo() {
    }

    public ImageInfo(String sender, int age) {
        this.sender = sender;
        this.age = age;
    }

    public final static Parcelable.Creator<ImageInfo> CREATOR = new Parcelable.Creator<ImageInfo>() {

        @SuppressWarnings({
                "unchecked"
        })
        public ImageInfo createFromParcel(Parcel in) {
            ImageInfo instance = new ImageInfo();
            instance.sender = ((String) in.readValue((String.class.getClassLoader())));
            instance.age = ((int) in.readValue((int.class.getClassLoader())));
            return instance;
        }

        public ImageInfo[] newArray(int size) {
            return (new ImageInfo[size]);
        }

    };


    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(sender);
        dest.writeValue(age);
    }

    public int describeContents() {
        return  0;
    }
}

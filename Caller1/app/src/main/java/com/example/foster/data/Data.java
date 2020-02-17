package com.example.foster.data;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Data implements Parcelable {

    int logo;
    String Title;
    String SubTitle1;
    String SubTitle2;

    public int getLogo() {
        return logo;
    }

    public void setLogo(int log) {
        this.logo = log;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSubTitle1() {
        return SubTitle1;
    }

    public void setSubTitle1(String subTitle1) {
        SubTitle1 = subTitle1;
    }

    public String getSubTitle2() {
        return SubTitle2;
    }

    public void setSubTitle2(String subTitle2) {
        SubTitle2 = subTitle2;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.logo);
        dest.writeString(this.Title);
        dest.writeString(this.SubTitle1);
        dest.writeString(this.SubTitle2);
    }

    public Data() {
    }

    protected Data(Parcel in) {
        this.logo = in.readInt();
        this.Title = in.readString();
        this.SubTitle1 = in.readString();
        this.SubTitle2 = in.readString();
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel source) {
            return new Data(source);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };
}

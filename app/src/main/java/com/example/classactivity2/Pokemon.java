package com.example.classactivity2;

import android.os.Parcel;
import android.os.Parcelable;

public class Pokemon implements Parcelable {
    String pimg;
    String pname;

    String desc;
    String height;
    String weight;
    String ability;
    String type;


    public Pokemon(String pimg, String pname, String desc, String height, String weight, String ability, String type) {
        this.pimg = pimg;
        this.pname = pname;
        this.desc = desc;
        this.height = height;
        this.weight = weight;
        this.ability = ability;
        this.type = type;
    }





    protected Pokemon(Parcel in) {
        pimg = in.readString();
        pname = in.readString();

        desc = in.readString();
        height = in.readString();
        weight = in.readString();
        ability = in.readString();
        type = in.readString();

    }

    public static final Creator<Pokemon> CREATOR = new Creator<Pokemon>() {
        @Override
        public Pokemon createFromParcel(Parcel in) {
            return new Pokemon(in);
        }

        @Override
        public Pokemon[] newArray(int size) {
            return new Pokemon[size];
        }
    };


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pokemon(String pimg, String pname) {
        this.pimg = pimg;
        this.pname = pname;
    }

    public String getPimg()
    {
        return pimg;
    }

    public void setPimg(String pimg)
    {
        this.pimg = pimg;
    }

    public String getPname()
    {
        return pname;
    }

    public void setPname(String pname)
    {
        this.pname = pname;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(pimg);
        dest.writeString(pname);
        dest.writeString(type);
        dest.writeString(desc);
        dest.writeString(height);
        dest.writeString(weight);
        dest.writeString(ability);
    }
}

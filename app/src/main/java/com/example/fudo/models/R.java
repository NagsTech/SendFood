package com.example.fudo.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class R {

    @SerializedName("res_id")
    @Expose
    private Integer resId;

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

}

package com.example.smartplant.data.model.daftar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ResponseDaftar implements Serializable {
    @SerializedName("result")
    @Expose
    public List<DataResult> result = null;

    public List<DataResult> getResult() {
        return result;
    }

    public void setResult(List<DataResult> result) {
        this.result = result;
    }
}

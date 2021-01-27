package com.example.smartplant.data.model.katalog;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ResponseKatalog implements Serializable {
    @SerializedName("result")
    @Expose
    public List<DataResultKatalog> result = null;

    public List<DataResultKatalog> getResultKatalog() {
        return result;
    }

    public void setResultKatalog(List<DataResultKatalog> result) {
        this.result = result;
    }
}

package com.example.smartplant.data.model.penanaman;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ResponsePenanaman implements Serializable {
    @SerializedName("result")
    @Expose
    public List<DataResultPenanaman> result = null;

    public List<DataResultPenanaman> getResultPenanaman() {
        return result;
    }

    public void setResultpenanaman(List<DataResultPenanaman> result) {
        this.result = result;

    }

}

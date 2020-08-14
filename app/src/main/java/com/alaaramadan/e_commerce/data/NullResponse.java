
package com.alaaramadan.e_commerce.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NullResponse {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("massage")
    @Expose
    private String message;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}

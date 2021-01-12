package com.inventrax.starquik.pojos;

import com.google.gson.annotations.SerializedName;

public class PutawayCountDTO {
    @SerializedName("InboundID")
    private String InboundID;
    @SerializedName("putwaycount")
    private String PutwayCount;
    @SerializedName("CrateNo")
    private String CrateNo;

    public String getPutwayCount() {
        return PutwayCount;
    }

    public void setPutwayCount(String putwayCount) {
        PutwayCount = putwayCount;
    }

    public String getInboundID() {
        return InboundID;
    }

    public void setInboundID(String inboundID) {
        InboundID = inboundID;
    }


    public String getCrateNo() {
        return CrateNo;
    }

    public void setCrateNo(String crateNo) {
        CrateNo = crateNo;
    }
}

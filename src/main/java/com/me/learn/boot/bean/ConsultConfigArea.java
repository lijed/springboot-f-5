package com.me.learn.boot.bean;

import org.apache.ibatis.type.Alias;

//@Alias("ConsultConfigArea")
public class ConsultConfigArea {

    public String areaCode;

    public String areaName;

    public Integer state;
    
    public String getAreaCode() {
        return areaCode;
    }
    
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    
    public String getAreaName() {
        return areaName;
    }
    
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
    
    public Integer getState() {
        return state;
    }
    
    public void setState(Integer state) {
        this.state = state;
    }
}

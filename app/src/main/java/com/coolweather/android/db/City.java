package com.coolweather.android.db;

import org.litepal.crud.DataSupport;
/**
 * Created by ASUS on 2017/7/26.
 */

public class City extends DataSupport{
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceceId;
    public int getId(){
        return  id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public int getProvinceceId(){
        return  provinceceId;
    }
    public void setProvinceceId(int provinceceId){
        this.provinceceId=provinceceId;
    }

}

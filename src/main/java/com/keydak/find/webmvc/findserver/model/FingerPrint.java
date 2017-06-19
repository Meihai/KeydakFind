package com.keydak.find.webmvc.findserver.model;

import java.util.ArrayList;

/**
 * Created by admin on 2017/6/17.
 */
public class FingerPrint {
    private String group;
    private String userName;
    private String location;
    private long time;
    private ArrayList<Router> wifiFingerPrint;

    public FingerPrint(){

    }

    public void setGroup(String group){
        this.group=group;
    }

    public String getGroup(){
        return this.group;
    }

    public void setUserName(String userName){
        this.userName=userName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setLocation(String location){
        this.location=location;
    }
    public String getLocation(){
        return this.location;
    }

    public void setTime(long time){
        this.time=time;
    }

    public long getTime(){
        return this.time;
    }

    public void setWifiFingerPrint(ArrayList<Router> wifiFingerPrint){
        this.wifiFingerPrint=wifiFingerPrint;

    }

    public ArrayList<Router> getWifiFingerPrint(){
        return this.wifiFingerPrint;
    }

    @Override
    public String toString(){
        return this.group+this.userName+this.location+this.wifiFingerPrint.toString();
    }
}

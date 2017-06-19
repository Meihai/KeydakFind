package com.keydak.find.webmvc.findserver.model;

/**
 * Created by admin on 2017/6/17.
 */
public class Router {
    private String mac;
    private int rssi;

    public Router(){

    }

    public String getMac(){
        return this.mac;
    }

    public void setMac(String mac){
        this.mac=mac;
    }

    public int getRssi(){
        return this.rssi;
    }

    public void setRssi(int rssi){
        this.rssi=rssi;
    }

    @Override
    public String toString(){
        return this.mac+","+this.rssi;
    }
}

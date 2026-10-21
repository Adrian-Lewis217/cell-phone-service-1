package com.pluralsight;

public class CellPhone {
    private int serialNum;
    private String model;
    private String carrier;
    private String phoneNum;
    private String owner;
}

// constructor
public CellPhone(){
    this.serialNum = 0;
    this.model = "";
    this.carrier = "";
    this.phoneNum = "";
    this.owner = "";
}

// Getter and Setter
public int getSerialNum(){
    return serialNum;
}

public void setSerialNum(int serialNum){
    return this.serialNum;
}


package com.example.medicationbox;

public class Bank extends Payment {
    private int routing;
    private int accountNo;
    private String name;
    public final String type = "bank";

    Bank(int routing, int accountNo, String name)
    {
        this.routing = routing;
        this.accountNo = accountNo;
        this.name = name;
    }

    @Override
    public String getCode(){
        return name;
    }

    @Override
    public void charge(double amt){

    }
}

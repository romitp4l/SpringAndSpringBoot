package org.example.beans;

public class DieselEng implements IEngine{

    public DieselEng() {
        System.out.println("DieselEng Constructor");
    }

    @Override
    public boolean start() {
        System.out.println("DieselEng start");
        return true;
    }
}

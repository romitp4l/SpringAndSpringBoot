package org.example.beans;

public class PetrolEng implements IEngine{

    public PetrolEng() {
        System.out.println("PetrolEng Constructor");
    }

    @Override
    public boolean start() {
        System.out.println("PetrolEng start");
        return true;
    }
}

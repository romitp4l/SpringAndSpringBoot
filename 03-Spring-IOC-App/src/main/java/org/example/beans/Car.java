package org.example.beans;

public class Car {
    private IEngine engine;

    public Car() {
        System.out.println("Car Constructor");
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
        System.out.println("Setter method is being called");
        System.out.println("Injected   " + engine.getClass().getName());
    }

    public void drive(){
        boolean status = engine.start();

        if (status) {
            System.out.println("Journey Started");
        }else {
            System.out.println("Journey not started faulty engine");
        }
    }
}

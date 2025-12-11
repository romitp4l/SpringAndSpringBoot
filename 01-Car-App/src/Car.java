public class Car {
    private Engine engine;
//// constructor injection
//    public Car(Engine engine) {
//        this.engine = engine;
//    }

public void setEngine(Engine engine) {
    this.engine = engine;
}

    public void drive(){
        int status = engine.start();
        if (status >= 1) {
            System.out.println("Journey started");

        }else {
            System.out.println("Journey not started -> Engine problem");
        }
    }
}



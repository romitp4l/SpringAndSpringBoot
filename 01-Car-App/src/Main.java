
// CAR APPLICATION USING STRATEGY DESIGN PATTERN.



class Main {
    public static void main(String[] args) {

//        // this is called constructor injection for loosely coupling of the classes.
//        Car car = new Car( new DieselEng());


    // this is setter injection
        Car car = new Car();
        car.setEngine(new DieselEng());
        car.drive();
    }
}
package Class6;

public class Main {

    // subclass : car
    //supper class : vehicle

    public static void main(String[] args) {

        System.out.println("......... Car");

        // get car information
        Car car = new Car();
        //common information
        System.out.println(car.getBrand());
        System.out.println(car.hink());
        System.out.println(car.getNoOfTires());

        // specific methods
        System.out.println(car.getNumberOfPassengers());
        System.out.println(car.getHybridInformation());
        System.out.println(car.getModelName());

        System.out.println("......... Van");
        // get van information
        Van van = new Van();
        //common information
        System.out.println(van.getBrand());
        System.out.println(van.hink());
        System.out.println(van.getNoOfTires());

        // specific methods
        System.out.println(van.getNumberOfPassengers());
        System.out.println(van.getGasolineEngineDetails());
        System.out.println(van.getModelName());
    }
}

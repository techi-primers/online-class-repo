package Controller;

import Service.VehicleService;
import dto.Employee;

public class VehicleInfo {

    public static void main(String[] args) {

        VehicleService vehicleService = new VehicleService("Hond",8929,10);
        vehicleService.getVehicleInfo();
         Integer fuelAmount = 20;
        Integer distance = vehicleService.getDistance(fuelAmount);
        System.out.println("Distance "+distance);
        vehicleService.getTimeForTrip(distance,100);


    }

}

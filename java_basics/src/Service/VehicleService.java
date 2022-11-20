package Service;

public class VehicleService {

    private String vehicleName;
    private Integer vehicleNumber;
    private Integer fuelEfficiency;

    public VehicleService(String vehicleName, Integer vehicleNumber, Integer fuelEfficiency) {
        this.vehicleName = vehicleName;
        this.vehicleNumber = vehicleNumber;
        this.fuelEfficiency = fuelEfficiency;
    }

    public void getVehicleInfo() {

        System.out.println("Vehicle name :---"+ vehicleName);
        System.out.println("Vehicle name :---"+ vehicleNumber);
        System.out.println("Fuel efficiency  :----"+ fuelEfficiency);

    }

    public Integer getDistance(Integer fuelAmount) {

        Integer distance = fuelAmount*fuelAmount;
        return distance;

    }

    public void getTimeForTrip(Integer distance, Integer speed) {

        Integer time = distance/speed;
        System.out.println("Time "+time);

    }

}

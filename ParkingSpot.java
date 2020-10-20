public class ParkingSpot {
    String vehicleType; //Allowed types - Cars, Bikes, Trucks, Electric Vehicles
    long entryTime = System.currentTimeMillis();
    boolean isAvailable = true; //initial value
    String nameOfTheCustomer;
    String carNumber;
}

class ElectricSpot extends ParkingSpot{
    //Ask if the user wants to charge their vehicle and show the pricing
    //If yes, then we amount this to the bill
}

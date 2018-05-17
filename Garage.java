import java.util.ArrayList;
import java.util.Scanner;

public class Garage  {

    ArrayList<Vehicle> vehicles = new ArrayList<>();



    public void fixVehicle (){


int price = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleType().equalsIgnoreCase("Car")) {
                System.out.println("It will be £5000 to repair your car!");
                price = 5000;
            } else if (vehicle.getVehicleType().equalsIgnoreCase("bike")) {
                System.out.println("It will be £70 to repair your bike!");
                price = 70;
            } else if (vehicle.getVehicleType().equalsIgnoreCase("plane")) {
                System.out.println("It will be £10000000 to repair your plane!");
                price = 10000000;
            }

        }


}

    private static void   addVehicle(ArrayList<Vehicle> vehicles){

        System.out.println("What is the vehicles name?");
        Scanner addName = new Scanner(System.in);
        String vehicleName = (addName.nextLine());

        System.out.println("What is the vehicles type? (car, plane or bike)");
        Scanner addType = new Scanner(System.in);
        String vehicleType = (addType.nextLine());

        System.out.println("What is the price");
        Scanner addPrice = new Scanner(System.in);
        Double vehiclePrice = (addPrice.nextDouble());

        System.out.println("What year was the vehicle released?");
        Scanner addReleaseDate = new Scanner(System.in);
        int releaseDate = (addPrice.nextInt());

        vehicles.add(new Vehicle(vehicleName, vehicleType, vehiclePrice, releaseDate));


}

public void removeVehicleByType(String type) {

}

public void fixVehicle(String type){

}

public void emptyGarage(){

}


}


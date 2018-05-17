import java.util.ArrayList;

public class Vehicle {

    //Default variables for all vehicles
     String name;
    String vehicleType;
    double price;
    int releaseDate;


    //getters and setters of default vehicle values
    public Vehicle(String name, String vehicleType, double price, int releaseDate){

        this.name = name;
        this.vehicleType = vehicleType;
        this.price = price;
        this.releaseDate = releaseDate;

    }

    public String getName(){
        return name;
    }

    public String getVehicleType(){
        return vehicleType;
    }
    public double getPrice(){
        return price;
    }
    public int getReleaseDate(){
        return releaseDate;
    }


}
//sub class of cars in vehicles
class Cars extends Vehicle {

    //variables for cars only
    boolean convertable;
    boolean fourWheelDrive;

    //getters and setters for new car variables
    public Cars(String name, String vehicleType, double price, int releaseDate, boolean convertable, boolean fourWheelDrive) {
        super(name, vehicleType, price, releaseDate);
        this.convertable = convertable;
        this.fourWheelDrive = fourWheelDrive;
    }
    public boolean getConvertable() {
        return convertable;
    }

    public boolean getFourWheelDrive(){
        return fourWheelDrive;
    }
    public String toString() {
        return "Cars's name: " + this.name + " Cars's Price: " + this.price + " Release Date: " + this.releaseDate + " is it convertable? : " + this.convertable + " is it a four wheel drive? " +this.fourWheelDrive + "\n";
    }

}

//subclass of bikes within vehicles
class Bikes extends Vehicle {


    String colour;
    boolean hasBasket;


    public Bikes(String name, String vehicleType, double price, int releaseDate, String colour, boolean hasBasket) {
        super(name, vehicleType, price, releaseDate);
        this.colour = colour;
        this.hasBasket = hasBasket;
    }

    public String getColour(){
        return colour;
    }

    public boolean getHasBasket(){
        return hasBasket;
    }

    public String toString() {
        return "Bikes name: " + this.name + " Bike Price: " + this.price + " Release Date: " + this.releaseDate + "Bike Colour: " + this.colour + " Does it Have a Basket? " +this.hasBasket+ "\n";
    }
}
class Planes extends Vehicle {


    boolean hasPropeller;


    public Planes(String name, String vehicleType, double price, int releaseDate, boolean hasPropeller) {
        super(name, vehicleType, price, releaseDate);
        this.hasPropeller = hasPropeller;
    }
    public boolean getHasPropeller(){
        return hasPropeller;
    }

    public String toString() {
        return "Plane's name: " + this.name + " Plane's Price: " + this.price + " Release Date: " + this.releaseDate + " Does it Have a Propeller? : " + this.hasPropeller+ "\n";
    }
}
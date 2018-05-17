public class garageMain {

public static void main(String[] args){

//Creatin the "Cars" object to go into the vehicles arrayList (done on line 13), the extra booleans of convertable and four wheel drive are also added
    Cars rangeRover = new Cars("Range Rover", "Car", 300322.22, 2012, false, true);
    Cars ferrari = new Cars("Ferrari", "Car", 4231562.23, 2015, true, false);
    Cars porsche = new Cars("Porsche", "Car", 222351.23, 2008, true, false);

    //loading a new instance of the garage class
   Garage garage = new Garage();
   //adding the cars to the array list
    garage.vehicles.add(rangeRover);
    garage.vehicles.add(ferrari);
    garage.vehicles.add(porsche);

   //bike objects are also created to add to the vehicles arrayList, with the extra properties of colour and hasBasket
    Bikes niceBike = new Bikes("Pedal 2007", "Bike", 300, 2002, "red", false);
    Bikes oldBike = new Bikes("Marron X2", "Bike", 75, 1999, "green", true);
    Bikes coolBike = new Bikes ("Bikey McBikeface", "Bike", 50.50, 2018, "blue", true );

    //adding the bikes to the array list
    garage.vehicles.add(niceBike);
    garage.vehicles.add(oldBike);
    garage.vehicles.add(coolBike);

    //lastly the planes are added with the extra boolean "hasPropeller"
    Planes spitfire = new Planes("Spitfire 20023", "Plane", 120030345.45, 1943, true);
    Planes privateJet = new Planes("Private Jet", "Plane", 2250030345.45, 2004, false);
    Planes concord = new Planes("Concord", "Plane", 120030345.45, 1943, false);

    //adding the planes to the array
    garage.vehicles.add(spitfire);
    garage.vehicles.add(privateJet);
    garage.vehicles.add(concord);

    garage.fixVehicle();
    garage.addVehicle();
    System.out.println(garage.vehicles.toString());
}
}

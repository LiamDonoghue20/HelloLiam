import java.util.ArrayList;
import java.util.Scanner;

public class Garage {
    //declares an arrayList of vehicles
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    //boolean for the do while for the switch statement
    boolean stillUsing;

    //method to fix vehicles

    //method to load vehicle objects into the array
    public void loadObjects(){

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
        Bikes coolBike = new Bikes("Bikey McBikeface", "Bike", 50.50, 2018, "blue", true);

        //adding the bikes to the array list
        garage.vehicles.add(niceBike);
        garage.vehicles.add(oldBike);
        garage.vehicles.add(coolBike);

        //lastly the planes are added with the extra boolean "hasPropeller"
        Planes spitfire = new Planes("Spitfire 20023", "Plane", 120030345.45, 1943, true);
        Planes privateJet = new Planes("Private Jet", "Plane", 2250030345.45, 2004, false);
        Planes concord = new Planes("Concord", "Plane", 120030345.45, 1943, false);

        garage.vehicles.add(spitfire);
        garage.vehicles.add(privateJet);
        garage.vehicles.add(concord);

        //loads up the switch statement which is the entry point of the application
    }
    public void fixVehicle() {

        Scanner sca = new Scanner(System.in);


        System.out.println("What type of vehicle would you like to repair? (Please enter '[C]ar' '[B]ike' or '[P]lane'");
        String vehicleFix = (sca.nextLine());

        System.out.println("What is the severity of the damage? (Please answer: [L]ight [M]edium or [H]eavy");
        String vehicleDamge = (sca.nextLine());


        if (vehicleFix.equalsIgnoreCase("C") && vehicleDamge.equalsIgnoreCase("L")){

            System.out.println("It will cost £200 to fix your lightly damaged car");

        } else if (vehicleFix.equalsIgnoreCase("C") && vehicleDamge.equalsIgnoreCase("M")){

            System.out.println("It will cost £400 to fix your medium damaged car");

        } else if (vehicleFix.equalsIgnoreCase("C") && vehicleDamge.equalsIgnoreCase("H")){

            System.out.println("It will cost £1000 to fix your heavily damaged car");

        } else if (vehicleFix.equalsIgnoreCase("B") && vehicleDamge.equalsIgnoreCase("L")){

            System.out.println("It will cost £20 to fix your lightly damaged bike");

        } else if (vehicleFix.equalsIgnoreCase("B") && vehicleDamge.equalsIgnoreCase("M")){

            System.out.println("It will cost £80 to fix your medium damaged bike");

        } else if (vehicleFix.equalsIgnoreCase("B") && vehicleDamge.equalsIgnoreCase("H")){

            System.out.println("It will cost £120 to fix your medium damaged bike");

        } else if (vehicleFix.equalsIgnoreCase("P") && vehicleDamge.equalsIgnoreCase("L")){

            System.out.println("it will cost £1500 to fix your lightly damaged plane");

        } else if (vehicleFix.equalsIgnoreCase("P") && vehicleDamge.equalsIgnoreCase("M")){

            System.out.println("it will cost £10000 to fix your medium damaged plane");

        } else if (vehicleFix.equalsIgnoreCase("P") && vehicleDamge.equalsIgnoreCase("H")){

            System.out.println("it will cost £150000 to fix your heavily damaged plane");

        }


    }

    //method for adding a new vehicle to the array
    public void addVehicle() {
        Scanner sca = new Scanner(System.in);

        //user inputs the different information
        System.out.println("What is the vehicles name?");
        String vehicleName = (sca.nextLine());

        System.out.println("What is the vehicles type? (car, plane or bike)");
        String vehicleType = (sca.nextLine());

        System.out.println("What is the price");
        Double vehiclePrice = (sca.nextDouble());

        System.out.println("What year was the vehicle released?");
        int releaseDate = (sca.nextInt());
        sca.nextLine();



        if(vehicleType.equalsIgnoreCase("Car")){

            System.out.println("The car is convertable? (Please answer true or false) ");
            boolean isConvertable = (sca.nextBoolean());

            System.out.println("The car is 4 wheel drive? (Please answer true or false)" );
            boolean isFourWheel = (sca.nextBoolean());
            vehicles.add(new Cars(vehicleName, vehicleType, vehiclePrice, releaseDate, isConvertable, isFourWheel));


        } else if (vehicleType.equalsIgnoreCase("Plane")){

            System.out.println("The plane has a propeller? (Please answer true or false)");
            boolean hasPropeller = (sca.nextBoolean());
            vehicles.add(new Planes (vehicleName, vehicleType, vehiclePrice, releaseDate, hasPropeller));

        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            System.out.println("What colour is the bike?");
            String bikeColour = (sca.nextLine());

            System.out.println("The bike has a basket? Please answer true or false");
            boolean hasBasket = (sca.nextBoolean());

            vehicles.add(new Bikes(vehicleName, vehicleType, vehiclePrice, releaseDate, bikeColour, hasBasket));

        }



    }

    public void removeVehicleByName(String vehicleName) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Please enter the name of the vehicle you wish to delete!");
        String deletedVehicle = sca.nextLine();

        for (int i = 0; i < vehicles.size(); i++) {

            if (vehicles.get(i).getName().equalsIgnoreCase(deletedVehicle)) {
                vehicles.set(i, vehicles.get(vehicles.size() - 1));
                break;
            }
            if (i == vehicles.size() - 1) {
                System.out.println("That vehicle is not in your garage sorry!");
            }

        }

    }



    public void emptyGarage() {

    vehicles.clear();
    System.out.println("All vehicles have now been moved from your garage");

    }

    public void switchStatement() {


        Scanner selection = new Scanner(System.in);
        System.out.println("Please select an option! (1 - 4) ");
        System.out.println("1. View Vehicles");
        System.out.println("2. Prices to Fix");
        System.out.println("3. Add Vehicles");
        System.out.println("4. Delete Vehicles");
        System.out.println("5. Clear out garage");

        String userChoice = selection.nextLine();

        //converts the users choice to an int for comparsion with the array

        do {
            switch (userChoice.toUpperCase()) {
                case "1":
                    System.out.println(vehicles.toString());
                    break;
                case "2":
                    fixVehicle();
                    break;
                case "3":
                    addVehicle();
                    break;
                case "4":
                    System.out.println("Please enter the name of the vehicle you wish to delete!");
                    String deletedVehicle = selection.nextLine();
                    removeVehicleByName(deletedVehicle);
                    break;
                case "5":
                    System.out.println("Are you sure you want to clear your garage? (Y/N)");
                    String deleteYN = selection.nextLine();
                    if(deleteYN.equalsIgnoreCase("Y")){
                        emptyGarage();
                    } else if(deleteYN.equalsIgnoreCase("N")){
                        System.out.println("Returning to main menu...");
                        switchStatement();

                    } else {
                        System.out.println("That is not a valid choice!");
                    }

                    break;

                default:
                    break;

            }

            System.out.println("Would you like another option? (Y/N)");
            String anotherOption = selection.nextLine();
            if (anotherOption.equalsIgnoreCase("y")) {
                switchStatement();
            } else if (anotherOption.equalsIgnoreCase("N")) {
                System.out.println("Thank you for using the garage service");
                stillUsing = false;
            } else {
                stillUsing = true;
                System.out.println("That is not a valid choice!");

            }


        } while (stillUsing);
    }
}

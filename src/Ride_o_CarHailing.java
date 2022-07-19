import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;



public class Ride_o_CarHailing {

    public static void main(String args[]) throws ParseException {
        startFunction();

    }

    public static void startFunction() throws ParseException {
        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to Ride'O!");
        System.out.println("To register as a user press 1.");
        System.out.println("If you are an existing user press:\n   Press 2: Commuter\n   Press 3: Driver\n");


        choice = scan.nextInt();
        switch(choice) {
            case 1: {
                registerUser();
                break;
            }
            case 2: {
                setCommuterActions();
                break;
            }
            case 3: {
                setDriverActions();
                break;
            }
            default: System.out.println("Invalid Option.");
        }

    }

    public static void registerUser() throws ParseException {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Enter 1. For Commuter 2. For Driver");
        choice = scan.nextInt();
        switch(choice) {
            case 1: {
                System.out.println("Enter name:");
                String commuterName = scanner.nextLine();
                System.out.println("Enter phoneNumber:");
                String phoneNumber = scanner.nextLine();
                System.out.println("Enter mode of Payment:");
                String paymentMode = scanner.nextLine();

                Commuter commuter = new Commuter(commuterName,phoneNumber,paymentMode);
                commuter.displayCommuterDetails();
                break;
            }
            case 2: {
                System.out.println("Enter name:");
                String driverName = scanner.nextLine();
                System.out.println("Enter date Of Birth");
                Date driverdob = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
                System.out.println("Enter license:");
                String driverLicense = scanner.nextLine();
                System.out.println("Enter phoneNumber:");
                String phoneNumber = scanner.nextLine();
                System.out.println("Enter languages:");
                String languages = scanner.nextLine();

                Driver driver = new Driver(driverName,driverLicense,driverdob,phoneNumber,languages);
                driver.displayDriverDetails();
                break;
            }
            default: System.out.println("Invalid Option.");

        }

    }

    public static void setCommuterActions() throws ParseException {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select:\n 1: To hire a car and start a ride\n 2: To track a ride\n 3: To pay for a ride\n  ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                setRide();
                break;
            case 2:
                break;
            case 3:
                break;
            default: System.out.println("Invalid Option.");

        }
    }

    public static void setDriverActions() throws ParseException {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        // Creating default driver - if there was a login, this would take the login details
        String date = "08-20-1992 00:00:00.0";
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");

        Driver driver = new Driver("driverName","123456",dt.parse(date),"123-456-7890","English, Spanish");
        Vehicle car_1 = new Vehicle("Honda", "PA 1234532", 4, true, Vehicle.CAR);

        // Adding the existing vehicle to the vehicle list
        VehicleList vehicleList = new VehicleList();
        vehicleList.addVehicle(car_1);
        System.out.println("Printing Vehicles:\n");
        vehicleList.listAllVehicle();


        System.out.println("Select:\n 1: To register a new vehicle\n 2: To hire a vehicle\n 3: Turn on or off the ride\n 4: Accept or cancel a ride\n  ");
        System.out.println("Press 0 to return to main menu");
        int choice = scan.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter the registration number:\n");
                String regNo = scanner.nextLine();
                System.out.println("Enter the brand name:\n");
                String brand = scanner.nextLine();
                System.out.println("Enter the number of seats available:\n");
                int noSeats = scan.nextInt();
                System.out.println("Enter the type of vehicle (1: Car, 2: Bike, 3: Van):\n");
                int type = scan.nextInt();
                Vehicle new_vehicle = new Vehicle(brand, regNo, noSeats, true, type);
                vehicleList.addVehicle(new_vehicle);

                vehicleList.listAllVehicle();
                break;

            case 2:
            case 0: startFunction();


        }


    }


    public static void setRide() throws ParseException {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        // Creating default driver - if there was a login, this would take the login details
        Commuter commuter = new Commuter("commuterName","123-456-7890","Cash");

        System.out.println("Select a Type of Vehicle: 1- Car, 2- Bike, 3- Van");
        int vehicleType = scan.nextInt();

        if(vehicleType == 1){
            System.out.println("Select a Type of Car: 1- Small, 2- Medium, 3- Large");
            int carType = scan.nextInt();
        }

        System.out.println("Enter the pick up address:");
        String pickUpAddress = scanner.nextLine();

        System.out.println("Enter the drop off  address:");
        String dropOffAddress = scanner.nextLine();

        Ride ride = new Ride(java.time.LocalDate.now(), LocalTime.now(),pickUpAddress,dropOffAddress);
        ride.startRide(LocalTime.now());

        System.out.println("Enter 1 to stop ride:");
        int stopRideFlag = scan.nextInt();

        if (stopRideFlag==1){
            ride.endRide(LocalTime.now());
        }



    }
}

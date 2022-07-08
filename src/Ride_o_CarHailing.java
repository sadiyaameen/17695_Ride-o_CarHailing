import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Ride_o_CarHailing {
    public static void main(String args[]) throws ParseException {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to Ride'O!");
        System.out.println("To register press 1.");
        System.out.println("If you are an existing commuter press 2, if you are existing driver press 3.");


        choice = scan.nextInt();
        switch(choice) {
            case 1: {
                registerUser();
                break;
            }
            case 2: {
                setRide();
                break;
            }
            case 3: {
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

    public static void setRide(){
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

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



    }
}

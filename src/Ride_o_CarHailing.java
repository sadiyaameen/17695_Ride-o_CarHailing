import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Ride_o_CarHailing {
    public static void main(String args[]) throws ParseException {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Enter 1. For Driver 2. For Passenger");
        choice = scan.nextInt();
        switch(choice) {
            case 1: {
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
            }
            case 2: {

            }
        }



    }
}

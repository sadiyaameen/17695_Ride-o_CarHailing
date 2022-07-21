import java.util.Scanner;

public class VehicleFactoryParameterized {

    protected VehicleFactoryParameterized(){}

    public static Vehicle create(int type) {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the registration number:\n");
        String regNo = scanner.nextLine();
        System.out.println("Enter the brand name:\n");
        String brand = scanner.nextLine();
        System.out.println("Enter the number of seats available:\n");
        int noSeats = scan.nextInt();
        System.out.println("Is the vehicle available? (1 - yes . 2 - no)\n");
        int status_int = scan.nextInt();
        boolean status = false;
        if (status_int == 1) {status = true;}

        Vehicle vehicle = null;

        switch (type) {
            case Vehicle.CAR:
                System.out.println("Is this your Own Car or RideORental? (1 - Own Car . 2 - RideORental)\n");
                int carType = scan.nextInt();
                switch(carType) {
                    case 1:
                        System.out.println("Enter leaseStDt:\n");
                        String leaseStDt = scanner.nextLine();
                        System.out.println("Enter leaseEdDt:\n");
                        String leaseEdDt = scanner.nextLine();
                        vehicle = new RideORental(brand, regNo,noSeats,status,type,leaseStDt,leaseEdDt);
                        break;
                    case 2:
                        System.out.println("Enter the owner's name:\n");
                        String carOwnerName = scanner.nextLine();
                        vehicle = new OwnCar(brand, regNo,noSeats,status,type,carOwnerName);
                        break;
                }
                break;

            case Vehicle.BIKE:
                System.out.println("Enter the owner's name:\n");
                String bikeOwnerName = scanner.nextLine();
                vehicle = new Bike(brand, regNo,noSeats,status,bikeOwnerName,type);
                break;

            case Vehicle.VAN:
                System.out.println("Enter the owner's name:\n");
                String vanOwnerName = scanner.nextLine();
                vehicle = new Van(brand, regNo,noSeats,status,vanOwnerName,type);
                break;

            default: break;
        }
        return vehicle;
    }
}

public class Bike extends Vehicle{

    private String ownerName;

    public Bike(String brand, String regNo, int noSeats, boolean status, String ownerName) {
        super(brand, regNo, noSeats, status);
        this.ownerName = ownerName;
    }

}

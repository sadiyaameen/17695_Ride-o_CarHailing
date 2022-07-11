package withDesignPatterns;

public class Bike extends Vehicle {

    private String ownerName;

    public Bike(String brand, String regNo, int noSeats, boolean status, String ownerName, int type) {
        super(brand, regNo, noSeats, status,type);
        this.ownerName = ownerName;
    }

}

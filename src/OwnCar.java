public class OwnCar extends Car {
    private String ownerName;

    public OwnCar(String brand, String regNo, int noSeats, boolean status, String ownerName) {
        super(brand, regNo, noSeats, status);
        this.ownerName = ownerName;
    }

}

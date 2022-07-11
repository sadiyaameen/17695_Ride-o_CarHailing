package withDesignPatterns;

public class OwnCar extends Car {
    private String ownerName;

    public OwnCar(String brand, String regNo, int noSeats, boolean status, int type, String ownerName) {
        super(brand, regNo, noSeats, status,type);
        this.ownerName = ownerName;
    }

    public void addOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

}

public class Van  extends Vehicle{

    private String ownerName;

    public Van(String brand, String regNo, int noSeats, boolean status,String ownerName) {
        super(brand, regNo, noSeats, status);
        this.ownerName = ownerName;
    }
}

public class Van  extends Vehicle{

    private String ownerName;

    public Van(String brand, String regNo, int noSeats, boolean status,String ownerName,int type) {
        super(brand, regNo, noSeats, status,type);
        this.ownerName = ownerName;
    }
}

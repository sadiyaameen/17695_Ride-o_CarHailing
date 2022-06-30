public class RideORental extends Car {
    private String leaseStDt;
    private String leaseEdDt;

    public RideORental(String brand, String regNo, int noSeats, boolean status, String leaseStDt, String leaseEdDt){
        super(brand, regNo, noSeats, status);
        this.leaseStDt = leaseStDt;
        this.leaseEdDt =  leaseEdDt;
    }
}

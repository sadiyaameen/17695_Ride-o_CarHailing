public class RideORental extends Car {
    private String leaseStDt;
    private String leaseEdDt;

    public RideORental(String brand, String regNo, int noSeats, boolean status, int type, String leaseStDt, String leaseEdDt){
        super(brand, regNo, noSeats, status,type);
        this.leaseStDt = leaseStDt;
        this.leaseEdDt =  leaseEdDt;
    }

    public void addLease(String leaseStDt,String leaseEdDt){
        this.leaseStDt = leaseStDt;
        this.leaseEdDt =  leaseEdDt;
    }
}

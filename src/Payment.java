public class Payment {

    private static final float baseCost = 4;
    private float waitingCharges;
    private float tollCharges = 0;
    private float totalCost;
    private int mode;
    public static final int CCPAYMENT = 1;
    public static final int WALLET = 2;
    public static final int CASH = 3;


    public Payment(int mode){
        this.mode = mode;
    }

    //Function called only if there are toll charges
    public void setTollCharges(float tollCharges){
        this.tollCharges = tollCharges;
    }

    public void calculatePayment(Ride ride){
        this.waitingCharges = ride.returnWaitTime() * 1; // If every extra minute costs $1

        // Assume for this application the cost is calculated
        // as baseCost + waitingCharges + tollChargesIfAny + (total minutes of the ride/20)

        float totalMinutes = ride.returnRideTime()/20;

        this.totalCost = this.baseCost + this.waitingCharges + this.tollCharges + totalMinutes;

        System.out.println(this.totalCost);
    }

}

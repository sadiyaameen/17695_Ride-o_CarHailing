public class Payment {

    private float baseCost;
    private float waitingCharges;
    private float tollCharges;
    private int mode;
    public static final int CCPAYMENT = 1;
    public static final int WALLET = 2;
    public static final int CASH = 3;

    public Payment(float baseCost, float waitingCharges, float tollCharges, int mode){
        this.baseCost = baseCost;
        this.waitingCharges = waitingCharges;
        this.tollCharges = tollCharges;
        this.mode = mode;
    }

}

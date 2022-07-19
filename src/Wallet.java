public class Wallet extends PaymentMode{
    private float balance;
    private int mode;

    public Wallet(float balance){
        super(2);
        this.balance = balance;
    }
}

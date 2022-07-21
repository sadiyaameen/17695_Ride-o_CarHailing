import java.util.Scanner;

public class PaymentController implements IPaymentController {

    private IPaymentController paymentController;

    public PaymentController(IPaymentController pc){
        paymentController = pc;
    }

    private float total;

    @Override
    public float processPayment(Ride ride) {
        Scanner scan = new Scanner(System.in);

        Payment payment = ride.getPayment();

        System.out.println("Select the mode of payment.");
        System.out.println("Press 1: Credit Card, 2: Wallet, 3: Cash");
        int mode = scan.nextInt();
        payment.setPayment(mode);

        this.total = payment.getBaseCost() + payment.getWaitingCharges() + payment.getTollCharges();

        return this.total;
    }

    @Override
    public String formatEmail(Ride ride) {
        return null;
    }
}

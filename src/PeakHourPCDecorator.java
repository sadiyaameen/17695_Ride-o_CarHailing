import java.util.Scanner;

public class PeakHourPCDecorator implements IPaymentController {

    private float total;
    static final float PEAKHOURPERCENT = 0.25F;

    public PeakHourPCDecorator(IPaymentController paymentController) {
    }

//    public PeakHourPCDecorator(IPaymentController pc){
//        super(pc);
//    }

    public float processPayment(Ride ride) {

        Scanner scan = new Scanner(System.in);

        Payment payment = ride.getPayment();

        System.out.println("Select the mode of payment.");
        System.out.println("Press 1: Credit Card, 2: Wallet, 3: Cash");
        int mode = scan.nextInt();
        payment.setPayment(mode);

        this.total = (float) (payment.getBaseCost() + payment.getWaitingCharges() + payment.getTollCharges() + (PEAKHOURPERCENT * payment.getTotalCost()));
        return total;
    }
    public String formatEmail(Ride ride) {
//        String = super.formatEmail (ride) + “peak hour surcharge info”
        // add peak hour surcharge into to Email contents
        return null;
    }
}

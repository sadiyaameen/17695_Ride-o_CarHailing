import java.util.Scanner;

public class MemberPCDecorator {

    private float total;
    static final int MEMBERSHIPDISCOUNT = 2;

    public MemberPCDecorator(IPaymentController pc) {
    }

//    public float processPayment(Ride ride) {
//
//        Scanner scan = new Scanner(System.in);
//
//        Payment payment = ride.getPayment();
//
//        System.out.println("Select the mode of payment.");
//        System.out.println("Press 1: Credit Card, 2: Wallet, 3: Cash");
//        int mode = scan.nextInt();
//        payment.setPayment(mode);
//
//        this.total = (float) (payment.getBaseCost() + payment.getWaitingCharges() + payment.getTollCharges() - MEMBERSHIPDISCOUNT);
//        return total;
//    }
//    public String formatEmail(Ride ride) {
////        String = super.formatEmail (ride) + “peak hour surcharge info”
//        // add peak hour surcharge into to Email contents
//        return null;
//    }
}

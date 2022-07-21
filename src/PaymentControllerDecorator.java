public class PaymentControllerDecorator implements IPaymentController {


    private IPaymentController paymentController;

    public PaymentControllerDecorator(IPaymentController pc){
        super();
        paymentController = pc;
    }

    @Override
    public float processPayment(Ride ride) {
        return paymentController.processPayment(ride);
    }

    @Override
    public String formatEmail(Ride ride) {
        paymentController.formatEmail(ride);
        return null;
    }
}

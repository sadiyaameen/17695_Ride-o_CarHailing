import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class RideController {

    private LocalDate endDate;
    private String startTime;
    private String endTime;
    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
    private long rideTime;


    private IPaymentController paymentController;

    public RideController(IPaymentController pc) {
        paymentController = pc;
    }
    public RideController() {
//        paymentController = pc;
    }

    public boolean isPeakHour(Ride ride){

        //TODO: Add peak hour logic
        if (ride.getStartTime() == "19:00"){
            return true;
        }
        return false;
    }

    public boolean isMember(Ride ride){
        if (ride.getMembershipStatus() == 1){
            return true;
        }
        return false;
    }


    public void completeRide(Ride ride) throws ParseException {

        this.endDate = java.time.LocalDate.now();
        this.endTime = LocalTime.now().toString(); //"20:52:59.331148";
        Date formatStartTime = format.parse(this.startTime);
        Date formatEndTime = format.parse(this.endTime);

        this.rideTime = (Math.abs(formatEndTime.getTime() - formatStartTime.getTime())/1000)/60; // Difference in minutes
        System.out.println(this.rideTime);

        IPaymentController pc = paymentController;
        if (isPeakHour(ride) == true)
            pc = new PeakHourPCDecorator(paymentController);
        if (isMember(ride) == true) pc = (IPaymentController) new MemberPCDecorator(pc);
        pc.processPayment(ride);
        String emailContents = pc.formatEmail(ride);
//        emailCntrl.sendEmail(emailContents, BILLING);
    }

}


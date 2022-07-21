import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.Date;

public class Ride {

    private LocalDate startDate;
    private LocalDate endDate;
    private String startTime;
    private String endTime;
    private String timeBooked;
    private String timeArrived;
    private long waitingTime;
    private String pickUpAddress;
    private String dropOffAddress;
    private long rideTime;
    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
    private int mode;
    private int membershipStatus; // 1- if is member, 2 - if not a member


    public Ride(LocalDate startDate, LocalTime timeBooked, String pickUpAddress, String dropOffAddress,int membershipStatus){
        this.startDate = startDate;
        this.timeBooked = timeBooked.toString();
        this.pickUpAddress = pickUpAddress;
        this.dropOffAddress = dropOffAddress;
        this.membershipStatus = membershipStatus;
    }

    public void driverArrived(Time timeArrived) {
        LocalTime localTime = LocalTime.now();
//        this.waitingTime = localTime - this.timeArrived;
    }

    public void setAddress(String pickUpAddress, String dropOffAddress){
        this.pickUpAddress = pickUpAddress;
        this.dropOffAddress = dropOffAddress;
    }

    public void startRide(LocalTime time) throws ParseException {
        this.startDate = java.time.LocalDate.now();
        this.startTime = time.toString();
        Date formatStartTime = format.parse(this.startTime);
        Date formatBookedTime = format.parse(this.timeBooked);

        long wait = (Math.abs(formatBookedTime.getTime() - formatStartTime.getTime())/1000)/60; // Difference in minutes
        if (wait < 1) {
            this.waitingTime = 0;
        }
        else {
            this.waitingTime = wait;
        }
        System.out.println(this.startTime);

    }

//    public void completeRide(LocalTime time) throws ParseException {
//        this.endDate = java.time.LocalDate.now();
//        this.endTime = time.toString(); //"20:52:59.331148";
//        Date formatStartTime = format.parse(this.startTime);
//        Date formatEndTime = format.parse(this.endTime);
//
//        this.rideTime = (Math.abs(formatEndTime.getTime() - formatStartTime.getTime())/1000)/60; // Difference in minutes
//        System.out.println(this.rideTime);
//    }

    public long returnWaitTime(){
        return this.waitingTime;
    }

    public long returnRideTime(){
        return this.rideTime;
    }

    public Payment getPayment(){
        Payment payment = new Payment();
        return payment;
    }

    public String getStartTime(){
        return startTime;
    }

    public int getMembershipStatus(){
        return membershipStatus;
    }



}

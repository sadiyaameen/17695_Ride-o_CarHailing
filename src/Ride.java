import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

public class Ride {

    private Date startDate;
    private Date endDate;
    private Time startTime;
    private Time endTime;
    private Time timeBooked;
    private Time timeArrived;
    private Time waitingTime;
    private String pickUpAddress;
    private String dropOffAddress;


    public void rideBooked(Date startDate,Time timeBooked,String pickUpAddress,String dropOffAddress){
        this.startDate = startDate;
        this.timeBooked = timeBooked;
        this.pickUpAddress = pickUpAddress;
        this.dropOffAddress = dropOffAddress;
    }

    public void driverArrived(Time timeArrived) {
        LocalTime localTime = LocalTime.now();
//        this.waitingTime = localTime - this.timeArrived;
    }

    public void setAddress(String pickUpAddress, String dropOffAddress){
        this.pickUpAddress = pickUpAddress;
        this.dropOffAddress = dropOffAddress;
    }




}

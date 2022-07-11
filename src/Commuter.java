import java.util.Date;
import java.util.Vector;

public class Commuter {

    private String name;
    private String phoneNumber;
    private String paymentMode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Commuter(String name, String phoneNumber, String paymentMode){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.paymentMode = paymentMode;
    }


    public void displayCommuterDetails(){
        System.out.println("Name:"+this.name);
        System.out.println("Phone Number:"+this.phoneNumber);
        System.out.println("Default Payment Mode:"+this.paymentMode);

    }

    public void changeModeOfPayment(String paymentMode){
        this.paymentMode=paymentMode;
    }


}

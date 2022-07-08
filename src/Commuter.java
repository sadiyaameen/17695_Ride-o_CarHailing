import java.util.Date;
import java.util.Vector;

public class Commuter {

    private String name;
    private String phoneNumber;
    private String paymentMode;


    public Commuter(String name, String phoneNumber, String paymentMode){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.paymentMode = paymentMode;
    }


    public void setName(String name) { this.name = name;}
    public String getName(){ return name;}

    public void setContactNo(String contactNo) { this.phoneNumber = contactNo;}
    public String getContactNo(){ return phoneNumber;}

    public void setPaymentMode(String paymentMode) { this.paymentMode = paymentMode;}
    public String getPaymentMode(){ return paymentMode;}


    public void displayCommuterDetails(){
        System.out.println("Name:"+this.name);
        System.out.println("Phone Number:"+this.phoneNumber);
        System.out.println("Default Payment Mode:"+this.paymentMode);

    }

    public void changeModeOfPayment(String paymentMode){
        this.paymentMode=paymentMode;
    }


}

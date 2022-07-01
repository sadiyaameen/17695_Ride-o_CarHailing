import java.util.Date;
import java.util.Vector;

public class Commuter {

    private String name;
    private String phoneNumber;
    private String paymentMode;
    private Date datOfBirth;


    public Commuter(String name, String phoneNumber, String paymentMode,Date datOfBirth){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.paymentMode = paymentMode;
        this.datOfBirth = datOfBirth;
    }


    public void setName(String name) { this.name = name;}
    public String getName(){ return name;}

    public void setContactNo(String contactNo) { this.phoneNumber = contactNo;}
    public String getContactNo(){ return phoneNumber;}

    public void setPaymentMode(String paymentMode) { this.paymentMode = paymentMode;}
    public String getPaymentMode(){ return paymentMode;}

    public void setDatOfBirth(Date datOfBirth) { this.datOfBirth = datOfBirth;}
    public Date getDatOfBirth(){ return datOfBirth;}

    public void displayCommuterDetails(){
        System.out.println("Name:"+this.name);
        System.out.println("Date of Birth:"+this.datOfBirth);
        System.out.println("Phone Number:"+this.phoneNumber);
        System.out.println("Default Payment Mode:"+this.paymentMode);

    }


}

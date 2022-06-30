import java.util.Date;
import java.util.Vector;

public class Commuter {

    private String name;
    private String contactNo;
    private String paymentMode;


    public Commuter(String name, String contactNo, String paymentMode){
        this.name = name;
        this.contactNo = contactNo;
        this.paymentMode = paymentMode;
    }


    public void setName(String name) { this.name = name;}
    public String getName(){ return name;}

    public void setContactNo(String contactNo) { this.contactNo = contactNo;}
    public String getContactNo(){ return contactNo;}

    public void setDatOfBirth(String paymentMode) { this.paymentMode = paymentMode;}
    public String getPaymentMode(){ return paymentMode;}

}

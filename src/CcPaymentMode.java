import java.util.Date;

public class CcPaymentMode extends PaymentMode{
    private int number;
    private Date expDate;
    private String bank;
    private String authNo;
    private int mode=1;

    public void CcPaymentMode(int number,Date expDate,String bank,String authNo){
        this.number = number;
        this.expDate = expDate;
        this.bank = bank;
        this.authNo = authNo;
    }
}

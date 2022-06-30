import java.util.Date;
import java.util.Vector;

public class Driver {
    private String name;
    private String license;
    private Date datOfBirth;
    private Vector languages = null;
    private String phoneNumber;


    public Driver(String name, String license, Date datOfBirth, String phoneNumber,String languages){
        this.name = name;
        this.license = license;
        this.datOfBirth = datOfBirth;
        this.phoneNumber = phoneNumber;
//        this.languages = languages;
    }


    public void setName(String name) { this.name = name;}
    public String getName(){ return name;}

    public void setLicense(String license) { this.license = license;}
    public String getLicense(){ return license;}

    public void setDatOfBirth(Date datOfBirth) { this.datOfBirth = datOfBirth;}
    public Date getDatOfBirth(){ return datOfBirth;}

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber;}
    public String getPhoneNumber(){ return phoneNumber;}

    public void addLanguages (String newLanguage){
        languages.addElement(newLanguage);
    }
    public void removeItem(String removeLanguage){
        languages.removeElement(removeLanguage);
    }


    public void displayDriverDetails(){
        System.out.println("Name:"+this.name);
        System.out.println("License:"+this.license);
        System.out.println("Date of Birth:"+this.datOfBirth);
        System.out.println("Phone Number:"+this.phoneNumber);
    }


}


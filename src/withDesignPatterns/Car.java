package withDesignPatterns;

public class Car extends Vehicle {
    private int carType; //1: small, 2:medium, 3:large
    public static int SMALL = 1;
    public static int MEDIUM = 2;
    public static int LARGE = 3;


    public Car(String brand, String regNo, int noSeats, boolean status, int type) {
        super(brand, regNo, noSeats, status,type);
        this.carType = 2; // By default car size can be medium
    }

    public void selectCarType(int carType){
        if(carType >= 1 && carType <=3){
            this.carType = carType;
        }
        else{
            System.out.println("Car Type input invalid");
        }
    }
}

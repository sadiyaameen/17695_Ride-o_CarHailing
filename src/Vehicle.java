import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    private String brand;
    private String regNo;
    private int noSeats;
//    private enum status{AVAILABLE,UNAVAILABLE};
    private boolean status; // True - available . False - unavailable

    public int getType() {
        return type;
    }

    private int type; // 1-Car,2-bike or 3-Van
    public static final int CAR = 1;
    public static final int BIKE = 2;
    public static final int VAN = 3;

    private List<Vehicle> vehicles = new ArrayList<>();


    public Vehicle(String brand, String regNo, int noSeats,boolean status, int type) {
        this.brand = brand;
        this.regNo = regNo;
        this.noSeats = noSeats;
        this.status = status;
        this.type = type;

    }

    public void selectVehicleType(int type){
        switch (type){

        }
    }

    public void addVehicle(Vehicle newVehicle){
        vehicles.add(newVehicle);

    }

    public void removeVehicle(Vehicle removeVehicle){
        vehicles.remove(removeVehicle);

    }

}

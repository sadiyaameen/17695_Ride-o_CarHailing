import java.util.ArrayList;

public class Vehicle {

    private String brand;
    private String regNo;
    private int noSeats;
    private boolean status;
    private int type; // 1-Car,2-bike or 3-Van
    private ArrayList<Vehicle> vehicles;

    public Vehicle(String brand, String regNo, int noSeats,boolean status, int type) {
        this.brand = brand;
        this.regNo = regNo;
        this.noSeats = noSeats;
        this.status = status;
        this.type = type;
//        addVehicle(this);
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

    public void listAllVehicles(){
        System.out.println();
    }
}

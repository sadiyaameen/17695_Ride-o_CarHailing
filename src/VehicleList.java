import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VehicleList {

    Iterator iter = null;
    private static VehicleList oneInstance = null;
    private List<Vehicle> vehicles;


    public VehicleList(){
        vehicles = new ArrayList<Vehicle>();
    }


    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void removeVehicle(){

    }

    public void listAllVehicle(){
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(vehicles.get(i) + " ");
        }
    }

    public void createIterator(){

    }

//    public VehicleList getInstance(){
//        if (oneInstance == null)
//            oneInstance = new VehicleList();
//        return oneInstance;
//    }


    public void getAllAvailableVans(){
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getType() == Vehicle.VAN)
            System.out.println(vehicles.get(i) + " ");
        }
    }

    public void getAllAvailableCars(){
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getType() == Vehicle.CAR)
                System.out.println(vehicles.get(i) + " ");
        }

    }

    public void getAllAvailableBikes(){
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getType() == Vehicle.BIKE)
                System.out.println(vehicles.get(i) + " ");
        }

    }



//    public VehicleIterator createAvailableCarIterator() {
////        return new AvailableCarIterator();
//    }

}

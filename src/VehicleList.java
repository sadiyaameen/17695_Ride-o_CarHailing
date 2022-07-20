import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VehicleList {

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

    public List<Vehicle> getAllAvailableVans(){
        List<Vehicle>  list_of_vans = new ArrayList<Vehicle>();

        for (int i = 0; i < vehicles.size(); i++) {
            if ((vehicles.get(i).getType() == Vehicle.VAN) & (vehicles.get(i).getStatusOfVehicle())){
                System.out.println(vehicles.get(i) + " ");
                list_of_vans.add(vehicles.get(i));
            }
        }
        return list_of_vans;
    }

    public List<Vehicle> getAllAvailableCars(){
        List<Vehicle>  list_of_cars = new ArrayList<Vehicle>();

        for (int i = 0; i < vehicles.size(); i++) {
            if ((vehicles.get(i).getType() == Vehicle.CAR) & (vehicles.get(i).getStatusOfVehicle())){
                System.out.println(vehicles.get(i) + " ");
                list_of_cars.add(vehicles.get(i));
            }
        }
        return list_of_cars;

    }

    public List<Vehicle> getAllAvailableBikes(){
        List<Vehicle>  list_of_bikes = new ArrayList<Vehicle>();

        for (int i = 0; i < vehicles.size(); i++) {
            if ((vehicles.get(i).getType() == Vehicle.BIKE) & (vehicles.get(i).getStatusOfVehicle())){
                System.out.println(vehicles.get(i) + " ");
                list_of_bikes.add(vehicles.get(i));
            }
        }
        return list_of_bikes;

    }



//    public VehicleIterator createAvailableCarIterator() {
////        return new AvailableCarIterator();
//    }

}

import java.util.Iterator;

public class VehicleList {

    Iterator iter = null;
    private static VehicleList oneInstance = null;


    public void addVehicle(){

    }

    public void removeVehicle(){

    }

    public void listAllVehicle(){

    }

    public void createIterator(){

    }

    public VehicleList getInstance(){
        if (oneInstance == null)
            oneInstance = new VehicleList();
        return oneInstance;
    }


    public void getAllAvailableVans(){

    }

    public void getAllAvailableCars(){

    }

    public void getAllAvailableBikes(){

    }

    protected VehicleList(){}


//    public VehicleIterator createAvailableCarIterator() {
//
//
//
//    }
}
